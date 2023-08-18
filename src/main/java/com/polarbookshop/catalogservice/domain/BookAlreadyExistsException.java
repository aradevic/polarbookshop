package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistsException extends RuntimeException {

  public BookAlreadyExistsException(String isbn) {
    super("This book with ISBN " + isbn + " already exists." );
  }
}
