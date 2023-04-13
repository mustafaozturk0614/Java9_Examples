package com.bilgeadam.lesson015.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Bu iki arayı kullanarak bir map olusturalım
 * 
 * id değerlerine karşılık isimler gelsin  
 * 
 * harcamalar mapi olusturalaım isme karsılık o kişinin harcamaları gelsin 
 * 
 */

public class MapOrnek {

	static String[] calisanlar = { "Mustafa", "Öznur", "Elif" };
	static int[] ids = { 1, 2, 3 };

	static Integer[][] harcamalar = { { 500, 400, 120 }, { 100, 200, 800 }, { 500, 750, 1200 } };

	public static void main(String[] args) {

		Map<Integer, String> isimler = new HashMap<>();

		for (int i = 0; i < calisanlar.length; i++) {
			isimler.put(ids[i], calisanlar[i]);

		}

		// System.out.println(isimler.get(1));

		Map<String, Integer[]> harcamalarMap = new HashMap<>();

		for (int i = 0; i < ids.length; i++) {
			harcamalarMap.put(calisanlar[i], harcamalar[i]);
		}

		harcamalarMap.forEach((x, y) -> System.out.println(x + "-" + Arrays.toString(y)));

//		for (Entry<String, Integer[]> deger : harcamalarMap.entrySet()) {
//			System.out.println(deger.getKey());
//			for (Integer harcama : deger.getValue()) {
//				System.out.print(harcama + "-");
//			}
//			System.out.println();
//		}
	}

}
