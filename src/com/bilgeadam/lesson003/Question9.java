package com.bilgeadam.lesson003;
/*
 * bir dizide ki tüm sayıların toplamı 
 * ve her sayi için bu sayı tektir bu sayı çiftir diye bir çıktı verelim 
 * 2 sayısı çiftir
 * 5 sayısı tektir 
 * 
 */
public class Question9 {

	public static void main(String[] args) {
		int[] sayilar = { 1500, 120, 5, 85, -256, 16, 1258, -435, 148 };

		int toplam=0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam=toplam+sayilar[i];
			if(sayilar[i]%2==0) {
				System.out.println("dizi["+i+"]="+sayilar[i]+" sayısı çiftdir.");
			}else {
				System.out.println("dizi["+i+"]="+sayilar[i]+" sayısı tekdir.");
			}
			
		}
		
		System.out.println("toplam= "+toplam);
		
	}

}
