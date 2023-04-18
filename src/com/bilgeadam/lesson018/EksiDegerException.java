package com.bilgeadam.lesson018;

public class EksiDegerException extends Exception {

	private String message;

	public EksiDegerException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
