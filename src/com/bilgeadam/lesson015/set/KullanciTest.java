package com.bilgeadam.lesson015.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KullanciTest {

	Set<Kullanici> kullanicilar;
	Set<String> kullanıcıİsimleri;

	public KullanciTest() {
		this.kullanicilar = new LinkedHashSet<>();
		this.kullanıcıİsimleri = new TreeSet<>();
		kullanicilar.add(new Kullanici("yk1", "yk1@gmail.com", "123"));
		kullanicilar.add(new Kullanici("yk2", "yk2@gmail.com", "123"));
		kullanicilar.add(new Kullanici("yk3", "yk3@gmail.com", "123"));
		kullanicilar.add(new Kullanici("yk4", "yk4@gmail.com", "123"));
		kullanıcıİsimleri.add("yk1");
		kullanıcıİsimleri.add("yk2");
		kullanıcıİsimleri.add("yk3");
		kullanıcıİsimleri.add("yk4");

	}

	public void kullaniciEkle2() {

		Kullanici kullanici = new Kullanici("yk5", "yk5@gmail.com", "1234");
		Kullanici kullanici2 = kullanici;
		Kullanici kullanici3 = new Kullanici("yk6", "yk6@gmail.com", "123456");
		Kullanici kullanici4 = new Kullanici("yk5", "yk5@gmail.com", "1234");
		kullanicilar.add(kullanici);
		kullanicilar.add(kullanici2);
		kullanicilar.add(kullanici3);
		kullanicilar.add(kullanici4);

	}

	public void kullaniciEkle() {
		boolean kontrol = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kullanıcı ismi giriniz");
		String kullaniciAdi = scanner.nextLine();
		while (!kullanıcıİsimleri.add(kullaniciAdi)) {
			System.out.println("Kullanıcı adı daha once eklenmiştir");
			System.out.println("Lütfen yeni bir kullanıcı ismi daha giriniz");
			kullaniciAdi = scanner.nextLine();
		}

		System.out.println("Lütfen bir email  giriniz");
		String email = scanner.nextLine();
		System.out.println("Lütfen bir sifre  giriniz");
		String sifre = scanner.nextLine();
		kullanicilar.add(new Kullanici(kullaniciAdi, email, sifre));

	}

	public static void main(String[] args) {
		KullanciTest kullanciTest = new KullanciTest();
		kullanciTest.kullaniciEkle2();
		kullanciTest.kullanicilar.forEach(System.out::println);
	}
}
