package com.bilgeadam.lesson009.bilgisayaruygulaması;

import java.util.ArrayList;

public class Laptop extends Bilgisayar {

	private String ekran;
	private String batarya;
	private int sarjYuzdesi;

	public Laptop(String id, String ad, AnaKart anaKart, ArrayList<HariciDonanim> hariciDonanimlar, String ekran,
			String batarya, int sarjYuzdesi) {
		super(id, ad, anaKart, hariciDonanimlar);
		this.ekran = ekran;
		this.batarya = batarya;
		this.sarjYuzdesi = sarjYuzdesi;
		setTasınabilirMi(true);
	}

	public Laptop(String id, String ad, AnaKart anaKart, String ekran, String batarya, int sarjYuzdesi) {
		super(id, ad, anaKart);
		this.ekran = ekran;
		this.batarya = batarya;
		this.sarjYuzdesi = sarjYuzdesi;
		setTasınabilirMi(true);
	}

	@Override
	public String toString() {
		return "Laptop [ekran=" + ekran + ", batarya=" + batarya + ", sarjYuzdesi=" + sarjYuzdesi + " "
				+ super.toString() + "]";
	}

}
