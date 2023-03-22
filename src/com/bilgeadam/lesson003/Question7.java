package com.bilgeadam.lesson003;
/*
 * 
 * bir dizideki en buyuk 2. elamanı bulalım
 * 
 */


public class Question7 {

	public static void main(String[] args) {
		int[] sayilar = { 1500, 120, 5, 85, -256, 16, 1258, -435, 148 };
		
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
		
			if (sayilar[i]>max) {
				max=sayilar[i];
			}
		}
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]>max2 && sayilar[i]<max) {
				max2=sayilar[i];
			}
		}
	
		System.out.println("En buyuk sayi: "+max);
		System.out.println("İkinci en buyuk sayi: "+max2);
	}

}
