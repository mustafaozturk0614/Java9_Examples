package com.bilgeadam.lesson006_oop.uygulama1;

import java.util.Arrays;

/*
 * 3 tane kullanıcı yaratıp bunu kullancı listesine ekleyelim  
 * 
 */
public class Database {

	public static Kullanici[] kullaniciListesi = new Kullanici[6];

//	public static final int value = 25;

	public static int index;

	public static void veriTabanıBaslangıcDegerleri() {

		Kullanici kullanici1 = new Kullanici(index + 1, "Mustafa", "mustafa@gmail.com", "123", "musty");
		kullaniciListesi[index] = kullanici1;
		// kullanici1.setIsim("Serkan");
		index++;// 1
		Kullanici kullanici2 = new Kullanici(index + 1, "Mert", "mert@gmail.com", "123", "mert");
		kullaniciListesi[index] = kullanici2;
		index++;// 2
		Kullanici kullanici3 = new Kullanici(index + 1, "Tuba", "tuba.com", "123", "tuba");
		kullaniciListesi[index] = kullanici3;
		index++;// 3
	}

	public static boolean kullaniciVarMi(String username, String sifre) {

		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {

				if (username.equals(kullaniciListesi[i].getUsername())
						&& sifre.equals(kullaniciListesi[i].getSifre())) {

					return true;
				}
			}
		}

		return false;

	}

	public static void kullaniciEkle(Kullanici kullanici) {

		if (kullaniciListesi[kullaniciListesi.length - 1] != null) { // index>=kullaniciListesi.length - 2
			arrayBoyutuArttırma();
		}

		kullaniciListesi[index] = kullanici;
		index++;

	}

	public static void arrayBoyutuArttırma() {

		Kullanici[] temp = new Kullanici[kullaniciListesi.length + 5];
		for (int i = 0; i < kullaniciListesi.length; i++) {
			temp[i] = kullaniciListesi[i];
		}
		kullaniciListesi = temp;

	}

	public static void arrayBoyutuArttırma2() {

		Kullanici[] temp = Arrays.copyOf(kullaniciListesi, kullaniciListesi.length + 5);
		kullaniciListesi = temp;

	}

	public static void main(String[] args) {
		Database.veriTabanıBaslangıcDegerleri();
		arrayBoyutuArttırma2();
		arrayBoyutuArttırma2();
		arrayBoyutuArttırma2();
		System.out.println(kullaniciListesi.length);
		System.out.println(kullaniciListesi[0].getEmail());
	}
}
