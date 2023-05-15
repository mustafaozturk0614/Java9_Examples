package com.bilgeadam.lesson026.factory;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen loglama yapacagınız database ismini giriniz");

		String dbName = scanner.nextLine();
		ILogger logger = DatabeseFactory.createDatabase(dbName);

//		switch (dbName) {
//		case "postgre":
//			logger = new PostgreSql();
//			break;
//		case "mongo":
//			logger = new MongoDb();
//			break;
//		default:
//			break;
//		}

		logger.logToDatabase("xxxx");

	}

}
