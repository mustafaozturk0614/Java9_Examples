package com.bilgeadam.lesson020;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Bir alisveris tarihimiz olsun 
 * 
 * daha sonra birde her ayın 15 i bizim fatura kesim tarihimiz olsun 
 * 
 * 
 * 1- alisveris tarhi fartura tarihinden oncemi sonramı kontrol edip 
 * çıktı verelim ( fatura tarihine daha var ) sonra ise (fatura tarihi geçmiş) 
 * 
 * Yeni fatura tarihine kalan gunu yazdıralım ( fatura tarhine 3 gun kaldı ) 
 * 
 * 
 */
public class SiparisGunu {

	public static void main(String[] args) {

		// alisVerisYap();

		LocalDate alisVerisTarihi = alisVerisTarihiAl();

		LocalDate faturaTarihi = LocalDate.of(alisVerisTarihi.getYear(), alisVerisTarihi.getMonth(), 15);

		faturaTarihiKontrol(alisVerisTarihi, faturaTarihi);

	}

	public static void faturaTarihiKontrol(LocalDate alisVerisTarihi, LocalDate faturaTarihi) {

		if (alisVerisTarihi.isBefore(faturaTarihi)) {

			System.out.println("Fatura tarihine daha var");
			long kalanGun = ChronoUnit.DAYS.between(alisVerisTarihi, faturaTarihi);
			System.out.println(kalanGun + " gun vardır");

		} else if (alisVerisTarihi.isEqual(faturaTarihi)) {
			System.out.println("Fatura tarihi bugundur");
		} else {
			System.out.println("Fatura tarihi geçmiştir");
			faturaTarihi = faturaTarihi.plusMonths(1);
			long kalanGun = ChronoUnit.DAYS.between(alisVerisTarihi, faturaTarihi);
			System.out.println(kalanGun + " gun vardır");
		}

	}

	public static LocalDate alisVerisTarihiAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir fatura tarihi giriniz (yıl-ay-gun)");
		String tarih = scanner.nextLine();
		return LocalDate.parse(tarih);

	}

	public static int faturaGunuBelirle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir fatura tarihi giriniz");
		int fatura = scanner.nextInt();
		return fatura;
	}

	public static void alisVerisYap() {

		LocalDate alısVerisTarihi = LocalDate.now();
		int gun = faturaGunuBelirle();
		if (gun > alısVerisTarihi.getDayOfMonth()) {
			System.out.println("Fatura Tarihine daha vardır");
		} else if (gun == alısVerisTarihi.getDayOfMonth()) {
			System.out.println("Fatura tarihi bugundur");
		} else {
			System.out.println("Fatura tarihi Geçmişdir");
		}
	}

}
