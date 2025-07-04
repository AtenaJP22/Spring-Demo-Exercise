package com.example.demo.exception;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException() {
        super("Book ID mismatch");
    }

    public BookIdMismatchException(String message) {
        super(message);
    }
}
