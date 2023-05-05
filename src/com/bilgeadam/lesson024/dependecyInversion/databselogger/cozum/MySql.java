package com.bilgeadam.lesson024.dependecyInversion.databselogger.cozum;

public class MySql implements IDatabase {

	@Override
	public void log(String ex) {
		System.out.println(ex + "------> mysql e loglandı");

	}

}
