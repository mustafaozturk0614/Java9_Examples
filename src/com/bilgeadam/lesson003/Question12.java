package com.bilgeadam.lesson003;

/*
 * 1-Stringimiz bir arraya çevireceğiz 
 * array[0]= "01-Adana"
 * array[1]= "02-Adıyaman"
 * 2 -arayimiz donerken her şehir için bir çıktı vereceğiz
 * Adananın plaka kodu= 01
 * 
 * 
 */
public class Question12 {

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] dizi = sehirler.split(";");

		for (int i = 0; i < dizi.length; i++) {
			int index = dizi[i].indexOf("-");
			System.out.println(dizi[i].substring(index + 1) + " plaka kodu: " + dizi[i].substring(0, index));
		}

	}
}
