package com.bilgeadam.lesson015.set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * film kategorsi ekle diye bir metodumuz olsun 
 * String olarak aldıgı bir kategoriyi bir sete eklesin
 * eger daha once eklenmişşe bu kategori daha once eklenmiştir diye çıktı versin 
 * 
 * 
 */
public class SetOrnek {

	Set<String> kategoriler = new TreeSet<>();
	Scanner scanner = new Scanner(System.in);

	public void kategoriEkle() {
		System.out.println("Lütfen Bir Kategori girin");
		String kategori = scanner.nextLine();
		if (kategoriler.contains(kategori)) {
			System.out.println("Bu kategori daha once eklenmiştir");
		} else {
			kategoriler.add(kategori);
			System.out.println("Başarılı bir şekilde eklenmiştir");
		}

	}

	public void kategoriEkle2() {
		System.out.println("Lütfen Bir Kategori girin");
		String kategori = scanner.nextLine();
		if (kategoriler.add(kategori)) {
			System.out.println("Başarılı bir şekilde eklenmiştir");
		} else {
			System.out.println("Bu kategori daha once eklenmiştir");

		}

	}

	public static void main(String[] args) {
		SetOrnek setOrnek = new SetOrnek();
		setOrnek.kategoriEkle2();
		setOrnek.kategoriEkle2();
		setOrnek.kategoriEkle2();
		setOrnek.kategoriler.forEach(System.out::println);
	}

}
