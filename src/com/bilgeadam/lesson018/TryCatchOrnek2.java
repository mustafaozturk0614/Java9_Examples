package com.bilgeadam.lesson018;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Bir metot ile dışarıdan bir index alalım sonra o indexdeki değeri yazdıralım 
 * hata varsa try cach ile yakalayalım
 * 
 * 
 * array uzerinde gezerken toplayabildiğimiz değerleri toplama ekleyelim 
 * bir sayaç ile hata sayısını tutalım ve dongu sonunda da toplamı ve hata sayısını yazdırlaım 
 * 
 */
public class TryCatchOrnek2 {

	public static void main(String[] args) {
		String[] array = { "a", "30", "20", null, "abc", "50" };
		// indexAl(array);
		// toplam2(array);

		for (String string : array) {

			nullChek3(string);
		}

	}

	public static void indexAl(String[] array) {
		Scanner scanner = new Scanner(System.in);
		try {
			int index = scanner.nextInt();
			System.out.println("girdiğiniz indexdeki değer==> " + array[index]);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Girdiğiniz index değeri dizi boyutunun dışındadır lütfen 0 ile " + (array.length)
					+ " arasında bir sayı giriniz");
			System.out.println(e.toString());

		} catch (InputMismatchException e) {
			System.out.println("Lütfen bir sayı değeri giriniz");
		} finally {
			scanner.close();
		}
	}

	public static void toplam(String[] array) {

		int sayac = 0;
		int toplam = 0;

		for (String string : array) {
			try {

				toplam += Integer.parseInt(string);
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			} catch (Exception e) {
				System.out.println("baska bir hata" + e.toString());
				sayac++;
			}

		}

		System.out.println("toplam= " + toplam);
		System.out.println("hata sayısı= " + sayac);

	}

	public static void toplam2(String[] array) {

		int sayac = 0;
		int toplam = 0;

		for (String string : array) {
			try {
				string = nullChek(string);
				toplam += Integer.parseInt(string);
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			} catch (Exception e) {
				System.out.println("baska bir hata " + e.toString());
				sayac++;
			}
		}

		System.out.println("toplam= " + toplam);
		System.out.println("hata sayısı= " + sayac);

	}

	public static String nullChek(String string) {

		if (string == null) {
			throw new NullPointerException();
		}
		return string;
	}

	public static String nullChek2(String string) throws Exception {// cheked exception

		if (string == null) {
			throw new NullPointerException();
		}
		return string;
	}

	public static String nullChek3(String string) throws RuntimeException {// uncheked exception

		if (string == null) {
			throw new NullPointerException();
		}
		return string;
	}

	public static String nullChek4(String string) {

		if (string == null) {
			throw new RuntimeException();
		}
		return string;
	}
}
