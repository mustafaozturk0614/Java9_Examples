package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * 
 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
 * System.out.println("2- Çıkar"); System.out.println("3- Çarp");
 * System.out.println("4- Böl"); System.out.println("0- Çıkış");
 * System.out.println("Bir işlem Seçiniz");
 * 
 * bir döngümüz olucak bu döngüde işlem seçeceğiz 1- toplama kullanıcan = alana
 * kadar girilen sayıları toplasın ve ekrana yazdırsın; *
 * 
 * 5- iki asyı gireceğiz bu sayıların ebob ve ekokunu hesaplayıp bize yazdırsın
 * 
 * ekok=sayi*sayi2/ebob
 * 
 */

public class Question16 {

	public static void menu() {
		System.out.println("==Hesap makinesi===\n");
		System.out.println("1- Topla");
		System.out.println("2- Çıkar");
		System.out.println("3- Çarp");
		System.out.println("4- Böl");
		System.out.println("0- Çıkış");

	}

	public static int islemSec() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir işlem Seçiniz");
		int islem = scanner.nextInt();
		return islem;

	}

	public static void uygulama() {

		/*
		 * bir dongude olacak 0 gelince donguden çıkacağız 1-menumuz gelsin 1 işlem
		 * secelim daha sonra bu işleme gore metotlar yazıp çalıştıralım eğer 1 gelmiş
		 * ise topla metodu çalışssın topla()==>* kullanıcan = alana kadar girilen
		 * sayıları toplasın ve daha sonra toplamı donsun;
		 */
		int islem = 0;
		do {
			menu();
			islem = islemSec();
			switch (islem) {
			case 1:
				System.out.println("toplam= " + topla2());
				break;
			case 2:
				System.out.println("toplam= " + cikarma());
				break;
			case 0:
				System.out.println("case 0");
				break;

			default:
				break;
			}

		} while (islem != 0);

	}

	public static int topla() {
		int toplam = 0;
		System.out.println(
				"Toplanması istediğiniz sayıları girin ve işlemin yapılmasını istediğiniz zaman '=' tuşuna basın ");
		Scanner scanner = new Scanner(System.in);
		String sayi = "";

		while (!(sayi = scanner.nextLine()).equals("=")) {
			toplam += Integer.parseInt(sayi);
		}
		return toplam;
	}

	public static int topla2() {
		int toplam = 0;
		System.out.println(
				"Toplanması istediğiniz sayıları girin ve işlemin yapılmasını istediğiniz zaman '=' tuşuna basın ");
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		do {
			System.out.println("sayi giriniz");
			sayi = scanner.nextLine();
			if (!sayi.equals("=")) {
				toplam += Integer.parseInt(sayi);
			}

		} while (!sayi.equals("="));

		return toplam;
	}

	public static int cikarma() {
		int sonuc = 0;
		int sayac = 0;
		System.out.println(
				"Çıkarılmasını istediğiniz sayıları girin ve işlemin yapılmasını istediğiniz zaman '=' tuşuna basın ");
		Scanner scanner = new Scanner(System.in);
		String sayi = "";

		while (!(sayi = scanner.nextLine()).equals("=")) {
			sayac++;

			if (sayac == 1) {
				sonuc = Integer.parseInt(sayi);
			} else {
				sonuc -= Integer.parseInt(sayi);
			}
		}
		return sonuc;
	}

	public static void main(String[] args) {
		uygulama();
	}

}
