package com.bilgeadam.lesson005;

import java.util.Arrays;

public class Question17 {

	public static void main(String[] args) {

		int dizi[] = { 1, 5, 7 };

		int[] dizi2 = { 3, 53, 63, 8, 7, 78 };
		int[] dizi3 = null;

		dizi = diziyeElemanEkle(dizi, 8);

		dizi2 = diziyeElemanEkle(dizi2, 125);

		diziyeElemanEkle(dizi3, 5);

		System.out.println(Arrays.toString(dizi));
		System.out.println(Arrays.toString(dizi2));

	}

	public static int[] diziyeElemanEkle(int[] array, int number) {
		int[] yeniDizi = null;
		yeniDizi = new int[array.length + 1];

		for (int j = 0; j < array.length; j++) {
			yeniDizi[j] = array[j];
		}
		yeniDizi[yeniDizi.length - 1] = number;
		return yeniDizi;
	}

}
