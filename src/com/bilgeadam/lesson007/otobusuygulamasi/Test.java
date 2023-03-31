package com.bilgeadam.lesson007.otobusuygulamasi;

import java.util.Arrays;

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
		// otbus olusturma işlemleri
		Otobus otobus1 = new Otobus("1", "06", "Mustafa", 74, guzergah, "");
		Otobus otobus2 = new Otobus("2", "06", "Mert", 102, guzergah, "");
		Otobus otobus3 = new Otobus("3", "06", "Merve", 68, guzergah2, "");
		Otobus otobus4 = new Otobus("4", "06", "Zeliha", 74, guzergah2, "");
		Otobus otobus5 = new Otobus("5", "06", "Serkan", 102, guzergah, "");
		// Duraklara Otobus atama işlemleri
		// 1.yöntem
		Otobus[] otobusler = { otobus1, otobus2, otobus5 };
		durak1.setOtobusler(otobusler);
		durak2.setOtobusler(otobusler);
		Otobus[] otobusler2 = { otobus1, otobus2, otobus3, otobus4, otobus5 };
		durak3.setOtobusler(otobusler2);
		durak5.setOtobusler(otobusler2);
		Otobus[] otobusler3 = { otobus3, otobus4 };
		durak4.setOtobusler(otobusler3);

		// 2.yöntem
//		durak1.setOtobusler(new Otobus[3]);
//		durak1.getOtobusler()[0] = otobus1;
//		durak1.getOtobusler()[1] = otobus2;
//		durak1.getOtobusler()[2] = otobus5;

		// Guzergahlara durak atama işlemleri
		Durak[] duraklar1 = { durak1, durak2, durak3, durak5 };
		Durak[] duraklar2 = { durak4, durak3, durak5 };
		guzergah.setDuraklar(duraklar1);
		guzergah2.setDuraklar(duraklar2);
//		System.out.println(otobus1);
//
//		System.out.println(durak1);
		System.out.println(Arrays.toString(durak1.getOtobusler()));

	}
}
