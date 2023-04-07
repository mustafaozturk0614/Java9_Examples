package com.bilgeadam.lesson011.databseornekabstract;

import java.util.Scanner;

/*
 * databse secim metodumuz olsun 
 * sectiğimiz databse e göre databsedeki login metodunu ve 
 * manager sınıfından calıstır metodunu calıstırsın
 * 
 * 
 * 1-Mysql
 * 2-Oracle
 * 
 * kullanıcıdan databse secmesini istiyeceğiz  bu sayade sectiğimiz database 
 * gore metotolar çalışacak
 */
public class Main {

	public static void main(String[] args) {
//		Mysql mysql = new Mysql();
//		Manager manager2 = new Manager(mysql);

//		Database database1 = new Oracle();
//		Database database2 = new Mysql();
//
//		Manager manager = new Manager(database2);
//
//		manager.calistir();

		dataSec2();

	}

	public static void dataSec() {
		System.out.println("Lütfen database seciniz");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Mysql");
		System.out.println("2-Oracle");
		int sonuc = scanner.nextInt();
		scanner.nextLine();
		switch (sonuc) {
		case 1:
			Manager manager = new Manager(new Mysql());
			manager.calistir();
			break;
		case 2:
			Manager manager2 = new Manager(new Oracle());
			manager2.calistir();
			break;
		default:
			break;
		}

	}

	public static void dataSec2() {
		Manager manager;
		Database database = null;
		System.out.println("Lütfen database seciniz");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Mysql");
		System.out.println("2-Oracle");
		int sonuc = scanner.nextInt();
		scanner.nextLine();
		switch (sonuc) {
		case 1:
			database = new Mysql();
			break;
		case 2:
			database = new Oracle();
			break;
		default:
			break;
		}
		// database.login();
		manager = new Manager(database);
		manager.calistir();

	}
}
