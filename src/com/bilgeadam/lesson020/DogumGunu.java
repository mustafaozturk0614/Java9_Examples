package com.bilgeadam.lesson020;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * 
 * String olarak dogum gununuzu girin 
 * 
 * daha sonra bugune kadar kac yıl kac hafta kaç ay kaç gun yaşamıssınız onu yazdıralım 
 * 
 * 
 */
public class DogumGunu {

	public static void main(String[] args) {

		System.out.println("Lütfen Dogum tarhinizi giriniz(YYY/MM/DD)");
		Scanner scanner = new Scanner(System.in);
		String dogumTarihi = scanner.nextLine();
		LocalDate date = LocalDate.parse(dogumTarihi);
		LocalDate bugun = LocalDate.now();

		long gun = date.until(bugun, ChronoUnit.DAYS);
		long ay = date.until(bugun, ChronoUnit.MONTHS);
		long hafta = date.until(bugun, ChronoUnit.WEEKS);
		long yil = date.until(bugun, ChronoUnit.YEARS);

		System.out.println(yil + " yıl " + ay + " ay " + hafta + " hafta " + gun + " gun yaşamıssınız");

	}

}
