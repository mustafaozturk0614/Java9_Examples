package com.bilgeadam.lesson006_oop.uygulama1;

public class Uygulama {

	public static void main(String[] args) {

		Kullanici[] dizi = Database.kullaniciListesi;
		Database.veriTabanıBaslangıcDegerleri();

		for (Kullanici kullanici : dizi) {
			if (kullanici != null) {
				System.out.println(kullanici.isim);
			}
		}

	}

}
