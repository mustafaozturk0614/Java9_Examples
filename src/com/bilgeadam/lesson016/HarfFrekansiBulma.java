package com.bilgeadam.lesson016;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * dışarıdan bir string değer alacağız 
 * daha sonra bunu bir mapde saklayacagız
 * hangi harf kackere geçmiş 
 * 
 * m=1
 * e=1
 * r=1
 * h=1
 * a=2
 * b=1
 * 
 */
public class HarfFrekansiBulma {

	public void mapeAktar(Map<Character, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			if (!map.containsKey(kelime.charAt(i))) {
				map.put(kelime.charAt(i), 1);
			} else {
				map.put(kelime.charAt(i), map.get(kelime.charAt(i)) + 1);
			}
		}

	}

	public void mapeAktar2(Map<Character, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = scanner.nextLine();

		for (char c : kelime.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.replace(c, map.get(c) + 1);
			}
		}

	}

	public static void main(String[] args) {
		HarfFrekansiBulma harfFrekansiBulma = new HarfFrekansiBulma();
		Map<Character, Integer> map = new TreeMap<>();
		harfFrekansiBulma.mapeAktar2(map);

		for (Entry<Character, Integer> string : map.entrySet()) {
			System.out.println(string);
		}
		System.out.println("//////////////////////");
		map.forEach((k, v) -> System.out.println(k + "-" + v));
		System.out.println("//////////////////////");
		map.entrySet().stream().forEach(System.out::println);

	}

}
