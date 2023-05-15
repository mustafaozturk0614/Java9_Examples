package com.bilgeadam.lesson026.factory;

public class DatabeseFactory {

	public static ILogger createDatabase(String dbName) {
		switch (dbName) {
		case "postgre":
			return new PostgreSql();
		case "mongo":
			return new MongoDb();
		default:
			throw new RuntimeException("Girdiğiniz databse desteklenmemektedir");
		}
	}
}
