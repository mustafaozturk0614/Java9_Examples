package com.bilgeadam.marathoncozum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kutuphane implements IKutuphane {

	private final static List<Kitap> kitaplar = new ArrayList<>();
	private final static List<Musteri> musteriler = new ArrayList<>();
	private final static List<Kasiyer> kasiyerler = new ArrayList<>();
	private final static List<Kiralama> kiralamalar = new ArrayList<>();

//	public static <E extends Kisi> void kisiEkle(List<E> kisiler, Kisi kisi) {
//		kisiler.add((E) kisi);
//	}

	public static <T> void listeyeEkle(List<T> list, T object) {
		list.add(object);
	}

	public void musteriVeKasiyerOlustur() {
		Musteri musteri1 = new Musteri(1, "Ahmet Akçay");
		Musteri musteri2 = new Musteri(2, "Mehmet Gurel");
		Musteri musteri3 = new Musteri(3, "Ahmet Ada");
		Musteri musteri4 = new Musteri(4, "Ayse Gür");
		Kasiyer kasiyer1 = new Kasiyer(5, "Berkin Yardımcı", 12000);
		Kasiyer kasiyer2 = new Kasiyer(6, "Mustafa Öztürk", 13000);
		listeyeEkle(musteriler, musteri1);
		listeyeEkle(musteriler, musteri2);
		listeyeEkle(musteriler, musteri3);
		listeyeEkle(musteriler, musteri4);
		listeyeEkle(kasiyerler, kasiyer1);
		listeyeEkle(kasiyerler, kasiyer2);
	}

	public static void kitapOlustur() {
		listeyeEkle(kitaplar, new Kitap(1, "Esir Sehrin insanları"));
		listeyeEkle(kitaplar, new Kitap(2, "Ölü Canlar"));
		listeyeEkle(kitaplar, new Kitap(3, "Palto"));
		listeyeEkle(kitaplar, new Kitap(4, "Mutlu Ölüm"));
		listeyeEkle(kitaplar, new Kitap(5, "Kayıp Cennet"));
		listeyeEkle(kitaplar, new Kitap(6, "Gülün Adı"));
		listeyeEkle(kitaplar, new Kitap(7, "Huzursuzlugun Kitabı"));
		listeyeEkle(kitaplar, new Kitap(8, "Aylak Adam"));
		listeyeEkle(kitaplar, new Kitap(9, "Budala"));
		listeyeEkle(kitaplar, new Kitap(10, "Sırca Fanus"));
	}

	public void kiralamaOlustur() {
		Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), musteriler.get(0), kitaplar.get(0));
		kitaplar.get(0).setDurum(EDurum.KIRADA);
		Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(0), musteriler.get(1), kitaplar.get(0));
		kitaplar.get(0).setDurum(EDurum.KIRADA);
		Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(1), musteriler.get(1), kitaplar.get(1));
		kitaplar.get(1).setDurum(EDurum.KIRADA);
		kitaplar.get(1).setDurum(EDurum.KUTUPHANEDE);
		Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(1), musteriler.get(2), kitaplar.get(2));
		kitaplar.get(2).setDurum(EDurum.KIRADA);
		Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(1), musteriler.get(2), kitaplar.get(3));
		kitaplar.get(3).setDurum(EDurum.KIRADA);
		Kiralama kiralama6 = new Kiralama(6, kasiyerler.get(1), musteriler.get(3), kitaplar.get(3));
		kitaplar.get(3).setDurum(EDurum.KIRADA);
		listeyeEkle(kiralamalar, kiralama1);
		listeyeEkle(kiralamalar, kiralama2);
		listeyeEkle(kiralamalar, kiralama3);
		listeyeEkle(kiralamalar, kiralama4);
		listeyeEkle(kiralamalar, kiralama5);
		listeyeEkle(kiralamalar, kiralama6);
	}

	@Override
	public boolean kiralamaYap() throws KutuphaneException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen müsteri id nizi giriniz");
		int musteriId = Integer.parseInt(scanner.nextLine());
		Musteri musteri = musteriler.get(musteriId - 1);
		System.out.println("Lütfen Kasiyer id nizi giriniz");
		int kasiyerId = Integer.parseInt(scanner.nextLine());
		Kasiyer kasiyer = kasiyerler.get(kasiyerId - 1);
		System.out.println("Kirada Olmayan Kitaplar");
		kitaplar.stream().filter(k -> k.getDurum().equals(EDurum.KUTUPHANEDE)).forEach(x -> {
			System.out.println(x.getId() + "-" + x.getIsim());
		});
		System.out.println("Lütfen bir secim yapınız");
		int kitapId = Integer.parseInt(scanner.nextLine());
		Kitap kitap = kitaplar.get(kitapId - 1);

		if (kitap.getDurum().equals(EDurum.KIRADA)) {
			throw new KutuphaneException("Bu Kitap zaten Kirada  kiralama işlemi başarısız");
		} else {
			Kiralama kiralama = new Kiralama(kiralamalar.size() + 1, kasiyer, musteri, kitap);
			kiralamalar.add(kiralama);
			return true;
		}

	}

	@Override
	public Kitap kitapAra() throws KutuphaneException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen  kitap ismi giriniz");
		String isim = scanner.nextLine();

		Optional<Kitap> kitap = kitaplar.stream().filter(k -> k.getIsim().equalsIgnoreCase(isim)).findFirst();
//		List<Kitap> kitap2 = kitaplar.stream().filter(k -> k.getIsim().equalsIgnoreCase(isim)).collect(Collectors.toList())
//				
//		if(kitap2.isEmpty()) {
//			throw new KutuphaneException("Kitap bulunamadı");
//		}
//		
//		return kitap2.get(0);

		if (kitap.isEmpty()) {
			throw new KutuphaneException("Kitap bulunamadı");
		}
		return kitap.get();
	}

	@Override
	public Musteri musteriAra() throws KutuphaneException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen  musteri ismi giriniz");
		String isim = scanner.nextLine();
		Optional<Musteri> musteri = musteriler.stream().filter(m -> m.getIsim().equalsIgnoreCase(isim)).findFirst();
		if (musteri.isEmpty()) {
			throw new KutuphaneException("Musteri bulunamadı");
		}

		return musteri.get();
	}

	@Override
	public List<Kitap> kiralananKitaplar() throws KutuphaneException {
		List<Kitap> kiralananKitaplar = kitaplar.stream().filter(k -> k.getDurum().equals(EDurum.KIRADA))
				.collect(Collectors.toList());

		if (kiralananKitaplar.isEmpty()) {
			throw new KutuphaneException("Suan kirada kitap bulunamamaktadır");
		}

		return kiralananKitaplar;
	}

	public Musteri idyeGoreSonKiralayanKisi(int kitapId) throws KutuphaneException {
		List<Kiralama> kiralama = kiralamalar.stream().filter(k -> k.getKitap().getId() == kitapId)
				.collect(Collectors.toList());
		Musteri musteri = null;
		try {
			musteri = kiralama.get(kiralama.size() - 1).getMusteri();
		} catch (Exception e) {
			throw new KutuphaneException("Bu kitaba ait herhangiş bir kiralama yoktur");
		}

		return musteri;
	}

	public List<Musteri> kitapAdınaGoreKiralayanMusteriler(String kitapAdı) {

		List<Musteri> musteriList = kiralamalar.stream().filter(k -> k.getKitap().getIsim().equalsIgnoreCase(kitapAdı))
				.map(x -> x.getMusteri()).collect(Collectors.toList());
		return musteriList;
	}

	public List<Musteri> ahmIleBaslayanMusteriler() {

		List<Musteri> musteriList = musteriler.stream().filter(x -> x.getIsim().startsWith("Ahm"))
				.collect(Collectors.toList());

		List<Musteri> musteriList2 = kiralamalar.stream().map(x -> x.getMusteri())
				.filter(x -> x.getIsim().startsWith("Ahm")).collect(Collectors.toList());

		List<Musteri> musteriList3 = kiralamalar.stream().filter(k -> k.getMusteri().getIsim().startsWith("Ahm"))
				.map(x -> x.getMusteri()).collect(Collectors.toList());

		return musteriList;

	}

	public List<Kitap> musteriIdyeGoreKitaplar(int musteriId) {

		return kiralamalar.stream().filter(k -> k.getMusteri().getId() == musteriId).map(x -> x.getKitap())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Kutuphane kutuphane = new Kutuphane();
		kutuphane.musteriVeKasiyerOlustur();
		kutuphane.kitapOlustur();
		kutuphane.kiralamaOlustur();

		try {
			// kutuphane.kiralananKitaplar().forEach(System.out::println);
			System.out.println(kutuphane.idyeGoreSonKiralayanKisi(1));

		} catch (KutuphaneException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("====Ahm ile başlayanlar===");
		kutuphane.ahmIleBaslayanMusteriler().forEach(System.out::println);
		System.out.println("====kitap adına göre===");
		kutuphane.kitapAdınaGoreKiralayanMusteriler("Mutlu Ölüm").forEach(System.out::println);
		System.out.println("====musteri id sine göre===");
		kutuphane.musteriIdyeGoreKitaplar(3).forEach(System.out::println);

	}
}
