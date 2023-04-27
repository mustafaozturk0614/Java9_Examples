package com.bilgeadam.lesson021.okulapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utility {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 * @param stringDate gun ay yıl seklinde gelen string "dd/MM/yyy"
	 * @return Localdate turunde bir veri
	 */
	public static LocalDate stringToLocalDateDayMonthYear(String stringDate) {
		LocalDate date = null;
		try {
			String format = "dd/MM/yyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(stringDate, formatter);

		} catch (Exception e) {
			System.out.println("Geçerli bir tarihi formatı giriniz gun/ay/yıl şeklinde");
		}
		return date;
	}

	/**
	 * 
	 * gun ay yıl seklinde dısardan alınan string "dd/MM/yyy"
	 * 
	 * @return Localdate turunde bir veri
	 */
	public static LocalDate stringToLocalDateDayMonthYear() {
		System.out.println("Lütfen gun/ay/yıl seklinde bir tarih giriniz");
		String stringDate = scanner.nextLine();
		LocalDate date = null;
		try {
			String format = "dd/MM/yyy";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			date = LocalDate.parse(stringDate, formatter);

		} catch (Exception e) {
			System.out.println("Geçerli bir tarihi formatı giriniz gun/ay/yıl şeklinde");
		}
		return date;
	}

}
