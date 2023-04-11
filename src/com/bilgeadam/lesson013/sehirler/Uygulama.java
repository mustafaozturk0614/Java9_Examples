package com.bilgeadam.lesson013.sehirler;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * 1-Şehir sınıfımız olacak ==> isim plakakodu nufus
 * uygulma sınıfında sehirleri olustur diye bir metodumuz olsun 
 * bu metot iller arrayındeki sehirleri alarak herbirinden birer şehir nesnesi yaratalım
 * ve bunları bir listeye ekleyelim 
 * sehir sınıfında bir metot olsun plak kodlarını bizim için olustursun 
 * ornek==> 01,02......08,09,10,11
 * 
 * 2- Dışardan girilen harfle başlayan illeri donduren bir metot yazalım 
 * 
 * 3- nufusa göre sıralama kucukten buyuge
 * 4- isme gore bir sıralama yapalım 
 * 5-Listemin son 10 değerini isme gore sıralasın
 * 6- Comparable kullanarak plakaya gore sırala
 * 
 */
public class Uygulama {

	ArrayList<Sehir> sehirler = new ArrayList();

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();
		uygulama.sehirleriOlustur();

		List<Sehir> yeniSehirListesi2 = uygulama.sehirler.subList(71, 81);

		List<Sehir> yeniSehirListesi = uygulama.sehirler.subList(uygulama.sehirler.size() - 10,
				uygulama.sehirler.size());

		uygulama.ismeGoreSirala(uygulama.sehirler);
		Collections.shuffle(uygulama.sehirler);
		Collections.sort(uygulama.sehirler);

		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}

	}

	public void sehirleriOlustur() {

		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String sehirIsım = SehirDatabase.iller[i];
			Sehir sehir = new Sehir(sehirIsım, i);
			// sehir.setPlaka(sehir.plakaKoduUret(i));
			sehirler.add(sehir);
		}
	}

	public ArrayList<Sehir> sehirBul() {
		ArrayList<Sehir> sehirListesi = new ArrayList<>();
		System.out.println("Bulmak istediğiniz şehirlerin baş harfini giriniz");
		Scanner scanner = new Scanner(System.in);
		String harf = scanner.nextLine().toUpperCase();

		for (int i = 0; i < sehirler.size(); i++) {
			if (sehirler.get(i).getIsim().startsWith((harf.charAt(0) + ""))) {
				sehirListesi.add(sehirler.get(i));
			}
		}
		return sehirListesi;
	}

	public ArrayList<Sehir> nufusSırala(ArrayList<Sehir> liste) {

		Comparator<Sehir> comparator = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				return o1.getNufus() - o2.getNufus();
			}

		};

		Collections.sort(liste, comparator);

		return liste;

	}

	public List<Sehir> ismeGoreSirala(List<Sehir> liste) {
		Collator collator = Collator.getInstance(); // Türkçe karakter sorununu aşmak için kullandığımız bir sınıf

		Comparator<Sehir> comparator = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				return collator.compare(o1.getIsim(), o2.getIsim());
			}

		};

		Collections.sort(liste, comparator);

		return liste;
	}

}
