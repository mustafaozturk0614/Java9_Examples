package com.bilgeadam.lesson003;
/*
 * bir dizide ard arada gelen 2 indexdeki sayı değeri 2 ise true yazdırıp dongu sonlansın 
 * yoksa false yazdıralım
 * 
 * 
 */
public class Question8 {

static	boolean kontol2;
	
	public static void main(String[] args) {
	int [] sayilar= {2,-256,2,129,2,2};
	boolean kontrol=false;
	
	System.out.println("kontrol2==>"+kontol2);
	
	
	for (int i = 0; i < sayilar.length; i++) {
	
		if(sayilar[i]==2&&sayilar[i+1]==2) {
			kontrol=true;
			kontol2=true;
			break;
		}
	}
	
	System.out.println(kontrol);
	System.out.println("kontrol2==>"+kontol2);

	}

}
