package com.bilgeadam.lesson024.dependecyInversion.databselogger.cozum;

public class DatabaseLogger {

	IDatabase database;

	public DatabaseLogger(IDatabase database) {
		this.database = database;
	}

	public void log(String ex) {
		database.log(ex);
	}

}
