package com.example.restservicedemo;

import static com.jayway.restassured.RestAssured.delete;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertNotNull;

import javax.ws.rs.core.MediaType;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.restservicedemo.domain.Book;
import com.jayway.restassured.RestAssured;

public class BookServiceTest {

	public static final String BOOK_TITLE = "Eragon";
	public static final String BOOK_AUTHOR = "Paolini";

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/restservicedemo/api";
	}

	@Test
	public void addBooks() {
		delete("/book/").then().assertThat().statusCode(200);

		Book book = new Book(1L, BOOK_TITLE, BOOK_AUTHOR, 1994);

		given().contentType(MediaType.APPLICATION_JSON).body(book).when().post("/book/").then().assertThat()
				.statusCode(201);

		Book rBook = get("/book/1").as(Book.class);

		assertThat(BOOK_TITLE, equalToIgnoringCase(rBook.getTitle()));
		assertThat(BOOK_AUTHOR, equalToIgnoringCase(rBook.getAuthor()));

	}

	@Test
	public void getAllBooks() {
		String books = get("/book/all/").asString();

		assertNotNull(books);
	}

}