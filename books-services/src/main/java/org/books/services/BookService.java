package org.books.services;

import java.awt.print.Book;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/books")
public class BookService {
	@POST
	public Response addBook(Book isbn){
		return Response.ok().entity("adding the book.").build();
	}
	
	@DELETE
	@Path("/{isbn}")
	public Response deleteBook(@PathParam("isbn") String isbn){
		return Response.ok().entity("deleted book "+isbn+".").build();
	}
	
	@GET
	@Path("/{isbn}")
	public Response getBook(@PathParam("isbn") String isbn){
		return Response.ok().entity("get details of book "+isbn+".").build();
	}
	
	@GET
	public Response getAllBooks(){
		return Response.ok().entity("get all the books available.").build();
	}
	
	@PUT
	@Path("/{isbn}")
	public Response updateBook(@PathParam("isbn")String isbn,Book book){
		return Response.ok("updating the book "+isbn+".",MediaType.APPLICATION_JSON).build();
	}
}
