package com.bilgeadam.lesson026.factory.pizzaApp;

import java.util.Scanner;

/*
 * 
 * 
 * 
 */
public class PizzaSiparis {
	Scanner scanner = new Scanner(System.in);

	public void menu() {

		System.out.println("Pizza Sipariş Menusu");
		Pizza pizza = pizzaSec3();
		siparisHazirlam(pizza);
	}

	public void siparisHazirlam(Pizza pizza) {
		System.out.println("Siparisiniz==>" + pizza);
		System.out.println("Hazırlanıyor......");

	}

	public Pizza pizzaSec() {
		ETur tur = turSec();
		EHamurTipi hamurTipi = hamurTipiSec();
		EBoyut boyut = boyutSec();
		Pizza pizza = PizzaFactory.pizzaOlustur(tur, hamurTipi, boyut);
		return pizza;
	}

	public Pizza pizzaSec2() {
		ETur tur = (ETur) secim(ETur.values(), "Lütfen bir tur seciniz");
		EHamurTipi hamurTipi = (EHamurTipi) secim(EHamurTipi.values(), "Lütfen bir hamutr tipi seciniz");
		EBoyut boyut = (EBoyut) secim(EBoyut.values(), "Lütfen bir boyut seciniz");
		Pizza pizza = PizzaFactory.pizzaOlustur(tur, hamurTipi, boyut);
		return pizza;
	}

	public Enum secim(Enum[] dizi, String sorgu) {

		for (Enum deger : dizi) {
			System.out.println((deger.ordinal() + 1) + "-" + deger.name());
		}
		System.out.println(sorgu);
		int secim = scanner.nextInt();
		return dizi[secim - 1];
	}

	public <T> T secim2(T[] dizi, String sorgu) {

		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i + 1) + "-" + dizi[i]);
		}
		System.out.println(sorgu);
		int secim = scanner.nextInt();
		return dizi[secim - 1];
	}

	public Pizza pizzaSec3() {
		ETur tur = secim2(ETur.values(), "Lütfen bir tur seciniz");
		EHamurTipi hamurTipi = secim2(EHamurTipi.values(), "Hamur Tipi seciniz");
		EBoyut boyut = secim2(EBoyut.values(), "Boyut seciniz");
		Pizza pizza = PizzaFactory.pizzaOlustur(tur, hamurTipi, boyut);
		return pizza;
	}

	public EBoyut boyutSec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal() + 1) + "-" + boyut.name());
		}
		System.out.println("Lütfen bir hamur tipi seciniz");
		int secim = scanner.nextInt();
		return EBoyut.values()[secim - 1];
	}

	public EHamurTipi hamurTipiSec() {
		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println((hamurTipi.ordinal() + 1) + "-" + hamurTipi.name());
		}
		System.out.println("Lütfen bir hamur tipi seciniz");
		int secim = scanner.nextInt();
		return EHamurTipi.values()[secim - 1];
	}

	public ETur turSec() {
		for (ETur tur : ETur.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur.name());
		}
		System.out.println("Lütfen bir pizza turu seciniz");
		int secim = scanner.nextInt();
		return ETur.values()[secim - 1];
	}

	public static void main(String[] args) {
		PizzaSiparis pizzaSiparis = new PizzaSiparis();
		pizzaSiparis.menu();
	}

}
