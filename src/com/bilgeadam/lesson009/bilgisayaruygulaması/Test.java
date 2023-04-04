package com.bilgeadam.lesson009.bilgisayaruygulaması;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Ram ram = new Ram(16, 3200);
		HardDisk hardDisk = new HardDisk(512, 3000, 3000);
		İslemci islemci = new İslemci(4, 3, "7.Nesil");
		ArrayList<DahiliDonanim> dahiliDonanimlar = new ArrayList<>();
		dahiliDonanimlar.add(islemci);
		dahiliDonanimlar.add(hardDisk);
		dahiliDonanimlar.add(ram);
		AnaKart anaKart = new AnaKart(0, dahiliDonanimlar);

		ArrayList<HariciDonanim> hariciDonanimlar = new ArrayList<>();
		Mouse mouse = new Mouse(0);
		Klavye klavye = new Klavye("Mekanik", "Q");
		hariciDonanimlar.add(klavye);
		hariciDonanimlar.add(mouse);

		Laptop laptop = new Laptop("1", "Monster", anaKart, hariciDonanimlar, "", "", 60);

		System.out.println(laptop);

	}
}
