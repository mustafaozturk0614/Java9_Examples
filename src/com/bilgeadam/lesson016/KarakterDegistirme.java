package com.bilgeadam.lesson016;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * bi iki array uzeinden bir map yapıp 
 * bir metot yazalım
 * dışarıdan girilen kelimede turkce karakter varsa ingilizce karaktere cevirsin
 * 
 * 
 */
public class KarakterDegistirme {

	char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
	char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
	Map<Character, Character> map = new LinkedHashMap<>();

	public void mapOlustur() {
		for (int i = 0; i < englishWords.length; i++) {
			map.put(turkishWords[i], englishWords[i]);
		}

	}

	public void replace() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();

		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) {
				kelime = kelime.replace(c, map.get(c));
			}
		}
		System.out.println("===>" + kelime);
	}

	public static void main(String[] args) {
		KarakterDegistirme karakterDegistirme = new KarakterDegistirme();
		karakterDegistirme.mapOlustur();
		// karakterDegistirme.replace();
		karakterDegistirme.map.entrySet().stream().forEach(System.out::println);

	}

}
