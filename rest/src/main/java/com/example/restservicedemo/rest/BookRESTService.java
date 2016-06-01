package com.example.restservicedemo.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restservicedemo.domain.Book;
import com.example.restservicedemo.service.BookManager;

@Path("book")
public class BookRESTService {
	
	private BookManager bm = new BookManager();
	
	@GET
	@Path("/{bookId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("bookId") Long id) {
		Book b = bm.getBook(id);
		return b;
	}
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBook(Book book) {
		bm.addBook(book);
		return Response.status(201).entity("Book").build();
	}
	
	
	@GET
	@Path("/author/{author}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getBookByAuthor(@PathParam("author") String author){
		List<Book> Book = bm.getBookByAuthor(author);
		return Book;
	}
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAllBooks() {
		List<Book> books = bm.getAllBooks();
		return books;
	}
	
	@GET
	@Path("/testBook")
	@Produces(MediaType.TEXT_HTML)
	public String testBook() {
		return "REST API /book is running";
	}
	
	@DELETE
	public Response clearBooks() {
		bm.clearBooks();
		return Response.status(200).build();
	}

}