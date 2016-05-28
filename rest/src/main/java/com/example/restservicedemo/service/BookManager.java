package com.example.restservicedemo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.restservicedemo.domain.Book;

public class BookManager {
	
	private Connection connection;
	
	private static final String URL = "jdbc:hsqldb:hsql://localhost/workdb";
	private static final String CREATE_TABLE_BOOK = "CREATE TABLE Book(id bigint GENERATED BY DEFAULT AS IDENTITY, title varchar(20), author varchar(20), year integer)";

	private PreparedStatement addBooksStmt;
	private PreparedStatement deleteAllBooksStmt;
	private PreparedStatement getAllBooksStmt;
	private PreparedStatement getBookByIdStmt;
	
	private Statement statement;
	
	public BookManager() {
		try {
			connection = DriverManager.getConnection(URL);
			statement = connection.createStatement();
			
			ResultSet rs = connection.getMetaData().getTables(null, null, null, null);
			boolean tableExists = false;
			
			while (rs.next()) {
				if ("Book".equalsIgnoreCase(rs.getString("TABLE_NAME"))) {
					tableExists = true;
					break;
				}
			}
			
			if (!tableExists)
				statement.executeUpdate(CREATE_TABLE_BOOK);

			addBooksStmt = connection
					.prepareStatement("INSERT INTO Book (id, title, author, year) VALUES (?, ?, ?, ?)");
			deleteAllBooksStmt = connection
					.prepareStatement("DELETE FROM Book");
			getAllBooksStmt = connection
					.prepareStatement("SELECT id, title, author, year FROM Book");
			getBookByIdStmt = connection
					.prepareStatement("SELECT id, title, author, year FROM Book where id = ?");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	Connection getConnnection() {
		return connection;
	}
	
	public void clearBooks() {
		try {
			deleteAllBooksStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int addBook(Book book) {
		int count = 0;
		
		try {
			addBooksStmt.setLong(1, book.getId());
			addBooksStmt.setString(2, book.getTitle());
			addBooksStmt.setString(3, book.getAuthor());
			addBooksStmt.setInt(4, book.getYear());
			
			count = addBooksStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		
		try {
			ResultSet rs = getAllBooksStmt.executeQuery();
			
			while (rs.next()) {
				Book b = new Book();
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setYear(rs.getInt("year"));
				books.add(b);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return books;
	}
	
	public Book getBook(Long id) {
		Book b = new Book();
		
		try {
			getBookByIdStmt.setLong(1, id);
			ResultSet rs = getBookByIdStmt.executeQuery();
			
			while (rs.next()) {
				b.setId(rs.getInt("id"));
				b.setTitle(rs.getString("title"));
				b.setAuthor(rs.getString("author"));
				b.setYear(rs.getInt("year"));
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
}