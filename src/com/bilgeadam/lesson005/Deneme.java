package com.bilgeadam.lesson005;

/*
 * soru 2. (15p) Bir dizide tekrar eden ilk sayıyı bulan ve ekrana yazdıran bir static metod yazınız. Metod
parametre olarak int dizisi alacak ve ilk tekrar eden sayıyı bulup ekrana yazdıracaktır. Tekrar
eden sayı bulunmazsa “Tekrar eden sayı bulunamamıştır.” yazacaktır.
Örnek Run 1:
int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 }
 * 
 */
public class Deneme {

	public static void main(String[] args) {
		int sayi1 = 3;
		int sayi2 = 7;

		int toplam = sayi1++ + ++sayi1 + --sayi2;
		// 3 +5+6-6
		System.out.println(toplam);
		int sayiDizisi[] = { 0, 1, 5, 3, 1, 5, 8, 7 };

		ilkTekrarEdenSayiyiYaz(sayiDizisi);

	}

	public static void ilkTekrarEdenSayiyiYaz(int[] dizi) {

		int sayac = 1;
		// int tekrarEdenIlkSayi;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					sayac++;
				}
			}

			if (sayac != 1) {
				System.out.println("tekrar eden sayımız: " + dizi[i]);
				System.out.println("tekrar sayısı= " + sayac);
				break;
			}

		}

		if (sayac == 1) {
			System.out.println("tekrar eden sayı bulunamdı");
		}

	}
}
