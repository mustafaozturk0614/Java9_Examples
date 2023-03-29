package com.bilgeadam.lesson006_oop.uygulama1;

/*
 * 3 tane kullanıcı yaratıp bunu kullancı listesine ekleyelim  
 * 
 */
public class Database {

	public static Kullanici[] kullaniciListesi = new Kullanici[6];

	public static int index;

	public static void veriTabanıBaslangıcDegerleri() {

		Kullanici kullanici1 = new Kullanici(index + 1, "Mustafa", "mustafa@gmail.com", "123", "musty");
		kullaniciListesi[index] = kullanici1;
		index++;
		Kullanici kullanici2 = new Kullanici(index + 1, "Mert", "mert@gmail.com", "123", "mert");
		kullaniciListesi[index] = kullanici2;
		index++;
		Kullanici kullanici3 = new Kullanici(index + 1, "Tuba", "tuba.com", "123", "tuba");
		kullaniciListesi[index] = kullanici3;
		index++;

	}

}
