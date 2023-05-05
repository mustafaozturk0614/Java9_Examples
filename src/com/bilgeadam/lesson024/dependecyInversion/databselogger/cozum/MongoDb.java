package com.bilgeadam.lesson024.dependecyInversion.databselogger.cozum;

public class MongoDb implements IDatabase {

	public void log(String ex) {
		System.out.println(ex + "---->mongoya loglandı");
	}

}
