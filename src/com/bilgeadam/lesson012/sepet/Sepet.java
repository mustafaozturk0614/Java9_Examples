package com.bilgeadam.lesson012.sepet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * "Cips", "Kola", "Şeker", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt" 
 * sabit urunlerimiz olsun (Enum)
 * 
 * 
 * daha sonra sepet sınıfında String bir urun arrayi tutatlım veya Listesi
 * bu urunlistesi Urun enumunu referans alacak 
 * birde String olarak bir sepet listemiz olsun
 * 
 * 1- metot enumda ki verilerden sepette sınıfmızdaki urunler listemizi doldursun 
 * 2- menu olusturalım 
 * 	1-Urunleri listele
 * 	2- Sepete ekle
 * 	3- sepeti goster
 * 
 * daha sonra bu 3 secenege birer metot yazalım 
 * 
 * 
 * 
 * 
 */
public class Sepet {

	List<String> urunler;
	List<String> sepet;
	static Scanner scanner = new Scanner(System.in);

	public Sepet() {
		this.urunler = new ArrayList<>();
		this.sepet = new ArrayList<>();
		urunleriOlustur();
	}

	public void urunleriOlustur() {

		for (EUrun urun : EUrun.values()) {
			this.urunler.add(urun.name());
		}
	}

	public void menu() {
		boolean devam = true;
		while (devam) {
			System.out.println("Sepet Menusu");
			System.out.println("1-Urunleri Listele");
			System.out.println("2-Sepete Ekle");
			System.out.println("3-Sepeti Goster");
			System.out.println("4-Cıkıs");
			System.out.println("Lütfen bir secim yapınız");
			int secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 1:
				urunleriListele();
				break;
			case 2:
				urunEkle();
				break;
			case 3:
				sepetiGoster();
				break;
			case 4:
				devam = false;
				break;
			default:
				System.out.println("Geçersiz Seçim!!!!!");
				break;
			}

		}

	}

	private void sepetiGoster() {
		if (sepet.isEmpty()) {
			System.out.println("Sepetiniz Boş");
		} else {
			int sayac = 1;
			for (String urun : sepet) {
				System.out.println(sayac + "-" + urun);
				sayac++;
			}
		}

	}

	private void urunEkle() {
		urunleriListele();
		System.out.println("Lutfen bir urun seciniz");
		int secim = Integer.parseInt(scanner.nextLine());
		if (!secimKontrol(secim)) {
			System.out.println("Yanlış bir değer girdiniz");
		} else {
			this.sepet.add(urunler.get(secim - 1));
		}
	}

	public boolean secimKontrol(int secim) {
		boolean kontrol = false;

		if (secim > 0 && secim <= urunler.size()) {
			kontrol = true;
		} else {
			kontrol = false;
		}
		return kontrol;
	}

	private void urunleriListele() {

		int sayac = 1;
		for (String urun : this.urunler) {
			System.out.println(sayac + "-" + urun);
			sayac++;
		}

	}

}
