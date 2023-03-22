package com.bilgeadam.lesson003;
/*
 * dizi içerisinde 1 ve 4 kaç defa geçtiğini ve 1 sayısının adeti
 * 4 sayısının adetinden buyuk ise true değilse false yazdıralım
 * 
 * 
 */
public class Question10 {

	public static void main(String[] args) {
		int[] sayilar = { 1,4, 5, 6, 1, 1, 4, 8 };
		
		int adet1=0;
		int adet4=0;
		boolean kontrol=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i]==1) {
				adet1++;
			}else if(sayilar[i]==4) {
				adet4++;
			}
			
		}
		
		/// 1.Çözüm	
		if (adet1>adet4) {
			kontrol=true;
		}else if (adet4==adet1) {
		System.out.println("eşit");
		}
		System.out.println(kontrol);
		
		/// 2.Çözüm
		boolean kontrol2=adet1>adet4;
		System.out.println("kontrol2===>"+kontrol2);
		
		
		
		System.out.println("1lerin adedi==>"+ adet1);
		System.out.println("4lerin adedi==>"+ adet4);
		
	}

}
