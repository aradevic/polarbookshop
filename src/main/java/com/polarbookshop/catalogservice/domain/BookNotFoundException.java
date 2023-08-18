package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {

  public BookNotFoundException(String isbn) {
    super("This book with ISBN " + isbn + " was not found." );
  }
}
