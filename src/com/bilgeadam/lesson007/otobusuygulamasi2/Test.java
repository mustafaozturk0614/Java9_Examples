package com.bilgeadam.lesson007.otobusuygulamasi2;

public class Test {

	public static void main(String[] args) {

		// durak olusturma işlemleri
		Durak durak1 = new Durak(1, "Keçiören", "Ankara");
		Durak durak2 = new Durak(2, "Dıskapi", "Ankara");
		Durak durak3 = new Durak(3, "Ulus", "Ankara");
		Durak durak4 = new Durak(4, "YeniMahalle", "Ankara");
		Durak durak5 = new Durak(5, "Kızılay", "Ankara");
		// Güzergah olusturma işlemleri
		Guzergah guzergah = new Guzergah(481);
		Guzergah guzergah2 = new Guzergah(203);
		// otobus olusturma işlemleri
		Otobus otobus1 = new Otobus("1", "06", "Mustafa", 74, guzergah, "");
		Otobus otobus2 = new Otobus("2", "06", "Mert", 102, guzergah, "");
		Otobus otobus3 = new Otobus("3", "06", "Merve", 68, guzergah2, "");
		Otobus otobus4 = new Otobus("4", "06", "Zeliha", 74, guzergah2, "");
		Otobus otobus5 = new Otobus("5", "06", "Serkan", 102, guzergah, "");

		// duraklara otobus atama
		Otobus[] otobusler1 = { otobus1, otobus2, otobus5 };
		durak1.otobusler = otobusler1;

		durak2.otobusler = new Otobus[3];
		durak2.otobusler[0] = otobus1;
		durak2.otobusler[1] = otobus2;
		durak2.otobusler[2] = otobus5;

		Otobus[] otobusler2 = { otobus1, otobus2, otobus3, otobus4, otobus5 };
		durak3.otobusler = otobusler2;
		durak5.otobusler = otobusler2;

		durak4.otobusler = new Otobus[2];
		// durak4.durakIsmi = "xxxx";
		durak4.otobusler[0] = otobus3;
		durak4.otobusler[1] = otobus4;

		System.out.println(guzergah.duraklar.length);

		guzergah.duraklar[0] = durak1;
		guzergah.duraklar[1] = durak2;
		guzergah.duraklar[2] = durak3;
		guzergah.duraklar[3] = durak5;

		System.out.println(guzergah.duraklar[0]);

		guzergah2.duraklar[0] = durak4;
		guzergah2.duraklar[1] = durak3;
		guzergah2.duraklar[2] = durak5;

		Durak[] duraklar = { durak1, durak2, durak3 };
		Guzergah guzergah3 = new Guzergah(duraklar, 421);

		System.out.println(guzergah3.duraklar.length);

	}

}
