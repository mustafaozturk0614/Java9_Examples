package com.bilgeadam.lesson004;

import java.util.Arrays;

/*
 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı
 * ise bilge 5'in ise adam hem3 ve hem 5 in katı ise bilgeadam yazdıralım int start=2; int
 * end=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge,22]
 * 
 * 
 */

public class Question13 {

	public static void main(String[] args) {

		int start = 2;
		int end = 22;
		String[] array = new String[end - start + 1];

		for (int i = 0; i < array.length; i++) {
			int sayi = i + start;

			if (sayi % 15 == 0) {
				array[i] = "bilgeadam";
			} else if (sayi % 5 == 0) {
				array[i] = "adam";
			} else if (sayi % 3 == 0) {
				array[i] = "bilge";
			} else {
				array[i] = sayi + ""; // Integer.toString(sayi)---- String.valueOf(sayi)
			}

		}

		System.out.print("[");
		for (String deger : array) {
			System.out.print(deger + ",");
		}
		System.out.print("]");

		System.out.println();
		System.out.println(Arrays.toString(array));
	}
}
