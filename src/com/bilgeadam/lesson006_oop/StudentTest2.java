package com.bilgeadam.lesson006_oop;

import java.util.Scanner;

/*
 * 
 * Bir metot yazalım bize bir ogrenci isimi alıp donsun (static olabiilr)
 * 
 * main metotda boyutu 5 olan bir ogrenci arrayi yaratalım 
 * 
 * ve bir for dongusu ile bu arrayi dolduralım 
 * 
 * en sonundada arrayi yazdıralım 
 * 
 */
public class StudentTest2 {

	public static void main(String[] args) {

		Student[] ogrenciler = new Student[5];

		// System.out.println(ogrenciler[0].ad);

		for (int i = 0; i < ogrenciler.length; i++) {
			Student student = new Student();
			student.ad = isimAl();
			student.kayit();
			ogrenciler[i] = student;
		}

		for (Student ogrenci : ogrenciler) {
			ogrenci.bilgileriGoster();
		}

	}

	public static String isimAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ogrenci ismi giriniz");
		String isim = scanner.nextLine();
		return isim;
	}

}
