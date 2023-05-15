package com.bilgeadam.lesson026.factory;

public class MongoDb implements ILogger {

	@Override
	public void logToDatabase(String message) {
		System.out.println(message + "----> mongodb ye loglandı");

	}

}
