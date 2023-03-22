package com.bilgeadam.lesson003;
/*
 * 
 * bir dizideki min ve max değerleri yazdıralım
 * 
 */


public class Question6 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, -435, 14 };
		
		int min=sayilar[0];
		int max=sayilar[0];
		
//		int min2=Integer.MAX_VALUE;
//		int max2=Integer.MIN_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
		
			if( sayilar[i]<min) {
				min=sayilar[i];
			}
			
			if(sayilar[i]>max) {
				max=sayilar[i];
			}
			
		}
		System.out.println("max= "+max +" "+"min= "+min);
		
	}

}
