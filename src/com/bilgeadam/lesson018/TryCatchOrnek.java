package com.bilgeadam.lesson018;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * bolme metodu olusturalım 
 * 2 tane sayı alalım 
 * ve bu işlemde bir hata varsa yakalayıp hata mesajını yazdıralım 
 * 
 * 
 * metodumuz bizden doğru sonuc alana kadar çalışşsın 
 * yani bir dongu kuracagız ve bu dongu bizden 2. degeri 0 aldıkca tekrar çalışacak 
 * 
 */
public class TryCatchOrnek {

	public static void main(String[] args) {

		System.out.println(bolme());
		;

		System.out.println("Program burdan devam ediyor");
	}

	public static double bolme() {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = false;
		double sonuc = 0;

		do {
			try {

				System.out.println("Lütfen 1.sayıyı giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("Lütfen 2.sayıyı giriniz");
				int sayi2 = scanner.nextInt();
				sonuc = (sayi1 / sayi2);
				System.out.println(sonuc);
				kontrol = false;
			} catch (ArithmeticException e) {
				System.out.println("2.sayıyı sıfır girdniz" + e.getMessage());
				e.printStackTrace();
				kontrol = true;
			} catch (InputMismatchException ex) {
				System.out.println("Lütfen sadece sayı giriniz" + ex.getMessage());
				kontrol = true;
			} catch (Exception e) {
				System.out.println("Bir hata olustu:");
				kontrol = true;
			} finally {
				System.out.println("Her zaman burası çalışır");
				scanner.nextLine();
			}
		} while (kontrol);

		return sonuc;
	}
}
