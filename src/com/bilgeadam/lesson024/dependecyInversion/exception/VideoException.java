package com.bilgeadam.lesson024.dependecyInversion.exception;

public class VideoException extends RuntimeException {

	String message;

	public VideoException(String message) {
		super(message);
		this.message = message;
	}

}
