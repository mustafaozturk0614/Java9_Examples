package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 
 * 2- Türkçe karakterleri inglizce karakterler çevirme		
    'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' 		
	bir metot ile bu işlemi yapalım  metot içerisinde dıaşırıdan bir kelime alacagız 
	bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüştüreceğiz ;
 * 
 */
public class Odev2 {

	public static void main(String[] args) {
		char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
		char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };

		System.out.println(replaceWords(turkishWords, englishWords));

	}

	public static String replaceWords(char[] turkishWords, char[] englishWords) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime geiriniz");
		String value = scanner.nextLine();

		for (int sayac = 0; sayac < englishWords.length; sayac++) {
			value = value.replace(turkishWords[sayac], englishWords[sayac]);
		}

		return value;
	}

}
