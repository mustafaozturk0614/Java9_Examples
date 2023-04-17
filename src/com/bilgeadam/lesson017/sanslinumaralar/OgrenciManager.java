package com.bilgeadam.lesson017.sanslinumaralar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OgrenciManager {
	List<Ogrenci> ogrenciler;

	public void baslangicVerisi() {
		ogrenciler = new ArrayList<>();
		Ogrenci Ogrenci1 = new Ogrenci(1, "Mustafa", "mat");
		Ogrenci1.getNotlar().add(50D);
		Ogrenci1.getNotlar().add(50.0);
		Ogrenci1.getNotlar().add(50D);
		Ogrenci Ogrenci2 = new Ogrenci(2, "Ayşe", "tm");
		Ogrenci2.getNotlar().add(80D);
		Ogrenci2.getNotlar().add(55D);
		Ogrenci2.getNotlar().add(79.5);
		Ogrenci Ogrenci3 = new Ogrenci(3, "Hakan", "tm");
		Ogrenci3.getNotlar().add(86D);
		Ogrenci3.getNotlar().add(97.5);
		Ogrenci3.getNotlar().add(50.5);
		Ogrenci Ogrenci4 = new Ogrenci(4, "Mert", "mat");
		Ogrenci4.getNotlar().add(80D);
		Ogrenci4.getNotlar().add(30D);
		Ogrenci4.getNotlar().add(82.5);
		Ogrenci Ogrenci5 = new Ogrenci(5, "Gamze", "mat");
		Ogrenci5.getNotlar().add(10D);
		Ogrenci5.getNotlar().add(35.7);
		Ogrenci5.getNotlar().add(58.3);
		Ogrenci Ogrenci6 = new Ogrenci(6, "Merve", "tm");
		Ogrenci6.getNotlar().add(36D);
		Ogrenci6.getNotlar().add(23.5D);
		Ogrenci6.getNotlar().add(57.5);
		ogrenciler = List.of(Ogrenci1, Ogrenci2, Ogrenci3, Ogrenci4, Ogrenci5, Ogrenci6);
	}

	public static void main(String[] args) {
		OgrenciManager ogrenciManager = new OgrenciManager();
		ogrenciManager.baslangicVerisi();

		// ogrencileri bolume gore mapleyelim
		// 1.yontem
		Map<String, List<Ogrenci>> bolumOgrencileri = ogrenciManager.ogrenciler.stream()
				.collect(Collectors.groupingBy(Ogrenci::getBolum));
		// 2.yontem
		bolumOgrencileri = ogrenciManager.ogrenciler.stream().collect(Collectors.groupingBy(o -> o.getBolum()));
		bolumOgrencileri.entrySet().forEach(System.out::println);

		// bütün ogrencilerin not ortalamasını bulalım

		Double ort = ogrenciManager.ogrenciler.stream().collect(
				Collectors.averagingDouble(o -> o.getNotlar().stream().collect(Collectors.averagingDouble(x -> x))));

		System.out.println(ort);

		Double ort2 = ogrenciManager.ogrenciler.stream().collect(Collectors.averagingDouble(o -> o.notOrtHesapla()));
		Double ort3 = ogrenciManager.ogrenciler.stream().collect(Collectors.averagingDouble(Ogrenci::notOrtHesapla));
		System.out.println(ort2);
		System.out.println(ort3);

		// ogrenci ismine karsılık not ortalaması olan bir map yapısı yapalım
		Map<String, Double> map = ogrenciManager.ogrenciler.stream()
				.collect(Collectors.toMap(Ogrenci::getIsim, Ogrenci::notOrtHesapla));
		Map<String, Double> map2 = ogrenciManager.ogrenciler.stream()
				.collect(Collectors.groupingBy(Ogrenci::getIsim, Collectors.averagingDouble(Ogrenci::notOrtHesapla)));
		map.entrySet().forEach(System.out::println);
		map2.entrySet().forEach(System.out::println);

		// not ortalaması 50 den kucuk olanların durumu kaldı buyuk olanarınki geçti
		// olarak guncellensin
		// 1.çözüm
		ogrenciManager.ogrenciler.stream().forEach(o -> {
			if (o.notOrtHesapla() > 50) {
				o.setDurum("Geçti");
			} else {
				o.setDurum("Kaldı");
			}

		});
		// 2.çözüm
		ogrenciManager.ogrenciler.stream().filter(x -> x.notOrtHesapla() > 50).forEach(y -> y.setDurum("Geçti"));
		ogrenciManager.ogrenciler.stream().filter(x -> x.notOrtHesapla() <= 50).forEach(y -> y.setDurum("Kaldı"));

		Map<String, String> durumListesi = ogrenciManager.ogrenciler.stream()
				.collect(Collectors.toMap(Ogrenci::getIsim, Ogrenci::getDurum));

		durumListesi.entrySet().forEach(System.out::println);

		// 1-her bir ogrenciye bir tanede sozlu notu ekleyelim yani 4.notu ekleyelim
		// 2- her bir ogrencinin her notuna +5 puan daha ekleyelim
	}
}
