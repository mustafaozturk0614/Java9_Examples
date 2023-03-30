package com.bilgeadam.lesson006_oop.uygulama1;

import java.util.Scanner;

/*
 *         System.out.println("1-Kayıt Ol");
			System.out.println("2-Giriş Yap");
			System.out.println("3-Kullanıcıları göster");
			System.out.println("4-Çıkış");
 * 
 * 
 * 1- menumuzu olusturacagız 
 * 2-secim yapan bir metot yazacagız
 * 3- uygulama metodu olacak burada medudeki işlemlere gore bir metot sececegiz
 * 4-Kayıt ol metodu yazalım ==> dışardıdan aldıgımız verilerler bir kullancı olusturup  
 * kullanıcı listesine ekleyelim
 * 5-giriş yap metodumuzu yazalım==> kullanıcı adı ve şifre istesin buna gore giriş başarı veya
 * giriş basarısız sonucu versin 
 * 
 */
public class Uygulama {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Kullanici[] dizi = Database.kullaniciListesi;
		Database.veriTabanıBaslangıcDegerleri();

		for (Kullanici kullanici : dizi) {
			if (kullanici != null) {
				System.out.println(kullanici.getIsim());
			}
		}
	}

	public void menu() {
		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giriş Yap");
		System.out.println("3-Kullanıcıları göster");
		System.out.println("4-Çıkış");

	}

	public int secimYap() {

		System.out.println("Lütfen bir işlem seçiniz");
		String secim = scanner.nextLine();
		return Integer.parseInt(secim);
	}

	public void uygulamayıBaslat() {
		int kontrol = 4;
		do {

			menu();
			kontrol = secimYap();
			switch (kontrol) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicilariGoster();
				break;

			case 4:

				break;
			default:
				break;
			}

		} while (kontrol != 4);

	}

	public void kullanicilariGoster() {
		System.out.println("Kullanıcı listesi");
		for (Kullanici kullanici : Database.kullaniciListesi) {
			if (kullanici != null) {
				System.out.println(kullanici.getIsim() + "-->" + kullanici.getUsername());
			}
		}
	}

	public void kayitOl() {
		System.out.println("Lütfen isminizi giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen email adreinizi giriniz");
		String mail = scanner.nextLine();
		System.out.println("Lütfen sifrenizi giriniz");
		String sifre = scanner.nextLine();
		System.out.println("Lütfen kullancı isminizi giriniz");
		String username = scanner.nextLine();
		Kullanici kullanici = new Kullanici(Database.index + 1, isim, mail, sifre, username);
		Database.kullaniciEkle(kullanici);
	}

	public void girisYap() {
		System.out.println("Lütfen kullancı isminizi giriniz");
		String username = scanner.nextLine();
		System.out.println("Lütfen sifrenizi giriniz");
		String sifre = scanner.nextLine();
		boolean kontrol = Database.kullaniciVarMi(username, sifre);

		if (kontrol) {
			System.out.println("Basarı ile giriş yapıldı");
		} else {
			System.out.println("Giriş başarısız");
		}

	}

}
