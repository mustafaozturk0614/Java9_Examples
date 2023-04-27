package com.bilgeadam.lesson021.threadgiris;

public class Test {

	public static void main(String[] args) {
		Calisan calisan1 = new Calisan("Mustafa");
		Calisan calisan2 = new Calisan("Ece");

		calisan1.start();
		calisan2.start();
		System.out.println("Program başlıyor");
		calisan1.calis();
		calisan2.calis();

	}

}
