package com.bilgeadam.lesson024.dependecyInversion.exception;

public class StoryException extends RuntimeException {

	String message;

	public StoryException(String message) {
		super(message);
		this.message = message;
	}

}
