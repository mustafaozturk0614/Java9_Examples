package com.bilgeadam.lesson004;

/*
 * 1-  int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };		
	bir metot yazalım bu metot dizi içindeki tek sayıları alıp başka bir tek boyutlu diziye atasın 
	daha sonra başka bir metot üzerinden bu tek sayılar dizisini yazdıralım;			
	
		
 * 
 * 
 */
public class Odev1 {

	public static int[] tekSayilariAta(int[][] matris) {
		int[] teksayilar = new int[matris.length * matris[0].length];// 4*5=20
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {

			for (int j = 0; j < matris[i].length; j++) {

				if (matris[i][j] % 2 != 0) {
					teksayilar[sayac] = matris[i][j];
					sayac++;
				}
			}
		}
		return teksayilar;
	}

	public static void arrayYazdir(int[] array) {

		for (int sayi : array) {
			if (sayi != 0) {
				System.out.println(sayi);
			}
		}

		System.out.println("Dizinin boyutu =====> " + array.length);
	}

	public static int tekSayiAdetiBul(int[][] matris) {
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {

			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					sayac++;

				}
			}
		}
		return sayac;
	}

	public static int[] tekSayilariAta(int[][] matris, int boyut) {
		int[] teksayilar = new int[boyut];
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {

			for (int j = 0; j < matris[i].length; j++) {

				if (matris[i][j] % 2 != 0) {
					teksayilar[sayac] = matris[i][j];
					sayac++;
				}
			}
		}
		return teksayilar;
	}

	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		// 1.yöntem
		int[] tekSayilar2 = tekSayilariAta(matris);
		arrayYazdir(tekSayilar2);
		System.out.println("===================================");
		// 2.yöntem
		int boyut = tekSayiAdetiBul(matris);
		int[] tekSayilar3 = tekSayilariAta(matris, boyut);
		arrayYazdir(tekSayilar3);
	}

}
