package org.libraryapp.exception;

public class NotValidException extends RuntimeException {
	public NotValidException(String alert) {
		super(alert);
	}

}
