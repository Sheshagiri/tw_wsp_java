package org.books.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class BooksApp extends Application {
	private Set<Object>		singletons	= new HashSet<Object>();

	private Set<Class<?>>	classes		= new HashSet<Class<?>>();

	public BooksApp() {
		singletons.add(new BookService());
		singletons.add(new ReviewService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
}
