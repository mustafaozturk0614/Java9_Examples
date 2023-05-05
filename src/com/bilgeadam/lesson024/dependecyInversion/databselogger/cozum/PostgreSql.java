package com.bilgeadam.lesson024.dependecyInversion.databselogger.cozum;

public class PostgreSql implements IDatabase {

	public void log(String ex) {
		System.out.println(ex + "---->postgreye loglandı");
	}

}
