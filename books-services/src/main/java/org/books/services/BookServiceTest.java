/**
 * 
 */
package org.books.services;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author smallipedhi
 *
 */
public class BookServiceTest extends TestCase {
	private BookService book;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		book = new BookService();
		super.setUp();
	}

	/**
	 * Test method for {@link org.books.services.BookService#addBook(java.awt.print.Book)}.
	 */
	public void testAddBook() {
		Assert.assertEquals("adding the book.", book.addBook(null).getEntity().toString());
	}

	/**
	 * Test method for {@link org.books.services.BookService#deleteBook()}.
	 */
	public void testDeleteBook() {
		Assert.assertEquals("deleted book 123456.", book.deleteBook("123456").getEntity().toString());
	}

	/**
	 * Test method for {@link org.books.services.BookService#getBook()}.
	 */
	public void testGetBook() {
		Assert.assertEquals("get details of book 123456.", book.getBook("123456").getEntity().toString());
	}

	/**
	 * Test method for {@link org.books.services.BookService#getAllBooks()}.
	 */
	public void testGetAllBooks() {
		Assert.assertEquals("get all the books available.", book.getAllBooks().getEntity().toString());
	}

	/**
	 * Test method for {@link org.books.services.BookService#updateBook(java.awt.print.Book)}.
	 */
	public void testUpdateBook() {
		Assert.assertEquals("updating the book 123456.", book.updateBook("123456", null).getEntity().toString());
	}

}
