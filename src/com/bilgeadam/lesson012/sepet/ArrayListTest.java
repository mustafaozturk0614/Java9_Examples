package com.bilgeadam.lesson012.sepet;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Y ile başlayan urunleri listeden silelim
 * daha sonra listeyi tekrar yazdıralım
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {

		// String[] dizi = { "Sut", "Yumurta" };
//"Cips", "Kola", "Şeker", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt" 
		List<String> urunler = new ArrayList<>();
		urunler.add("Sut");
		urunler.add("Kola");

		List<String> urunler2 = new ArrayList<>(
				List.of("Cips", "Kola", "Şeker", "YOĞURT", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt"));

		// ileBaslayalnleriSil(urunler2, 'Y');
		// ileBaslayalnleriSil3(urunler2);
		// ileBaslayalnleriSil4(urunler2, 'Y');
		degistir(urunler2);

	}

	public static void degistir(List<String> urunler2) {

		for (int i = 0; i < urunler2.size(); i++) {
			if (urunler2.get(i).equalsIgnoreCase("YOĞURT")) {
//				urunler2.remove(i);
//				urunler2.add(i, "XXX");
				urunler2.set(i, "XXX");
			}

		}
		for (String string : urunler2) {
			System.out.println(string);
		}
	}

	private static void ileBaslayalnleriSil(List<String> urunler2, char c) {
		for (int i = 0; i < urunler2.size(); i++) {
			if (urunler2.get(i).charAt(0) == c) {
				urunler2.remove(i);
				i--;
			}
		}
		for (String string : urunler2) {
			System.out.println(string);
		}

	}

	private static void ileBaslayalnleriSil4(List<String> urunler2, char c) {
		for (int i = urunler2.size() - 1; i >= 0; i--) {
			if (urunler2.get(i).charAt(0) == c) {
				urunler2.remove(i);
			}
		}
		for (String string : urunler2) {
			System.out.println(string);
		}

	}

	private static void ileBaslayalnleriSil2(List<String> urunler2) {
		List<String> urunlerYeni = new ArrayList<>(urunler2);

		for (String urun : urunler2) {
			if (urun.startsWith("Y")) {
				urunlerYeni.remove(urun);
			}
		}

		for (String string : urunlerYeni) {
			System.out.println(string);
		}
	}

	private static void ileBaslayalnleriSil3(List<String> urunler2) {

		for (String urun : urunler2) {
			if (urun.startsWith("Y")) {
				urunler2.remove(urun);
			}
		}

		for (String string : urunler2) {
			System.out.println(string);
		}
	}
}
