package com.bilgeadam.lesson002;
/*
 * 
 * Hayat,kısa,kuslar,ucuyor
 * bu string değeri virgullerden ayırıp her kelimeyi alt alta yazdıralım 
 * 
 * hayat
 * kısa
 * kuslar
 * ucuyor
 * 
 * 
 */
public class Question2 {

	public static void main(String[] args) {
		String kelime="Hayat,kısa,kuslar,ucuyor";
		int index=0;
		
		for (int i = 0; i < kelime.length(); i++) {
			
			if(kelime.charAt(i)==',') {
				System.out.println(kelime.substring(index,i));
				index=i+1;
			}
		}
		
	//	System.out.println(kelime.substring(index,kelime.length()));
		System.out.println(kelime.substring(index)); 
		System.out.println("///////////////////////////////////////////");
		//Hayat,kısa,kuslar,ucuyor
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i)==',') {
				System.out.println();
			}else {
				System.out.print(kelime.charAt(i));
			}
		}
		System.out.println();
		System.out.println("///////////////////////////");
		//Hayat\nkısa\nkuslar\nucuyor
		System.out.println(kelime.replace(",", "\n"));
		
		
	}

}
