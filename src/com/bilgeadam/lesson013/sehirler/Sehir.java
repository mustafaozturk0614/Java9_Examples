package com.bilgeadam.lesson013.sehirler;

import java.util.Random;

public class Sehir implements ISehir, Comparable<Sehir> {

	private String isim;
	private String plaka;
	private int nufus;

	public Sehir(String isim) {
		this.isim = isim;
		this.nufus = rastgeleNufusOlustur();
	}

	public Sehir(String isim, int index) {
		this.isim = isim;
		this.plaka = plakaKoduUret(index);
		this.nufus = rastgeleNufusOlustur();
	}

	public String getIsim() {
		return isim;
	}

	public String getPlaka() {
		return plaka;
	}

	public int getNufus() {
		return nufus;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public void setNufus(int nufus) {
		this.nufus = nufus;
	}

	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plaka=" + plaka + ", nufus=" + nufus + "]";
	}

	@Override
	public String plakaKoduUret(int index) {
		if (index < 9) {
			return "0" + (index + 1);
		}
		return index + 1 + "";
	}

	@Override
	public int rastgeleNufusOlustur() {
		Random random = new Random();
		return random.nextInt(100000, 20000000);
	}

	@Override
	public int compareTo(Sehir o) {
		// nufusa gore sıralama
//		if (this.nufus < o.nufus) {
//			return -1;
//		} else if (this.nufus > o.nufus) {
//			return 1;
//
//		}

//		return this.nufus-o.nufus;

		// plakaya gore sıralama
		return this.plaka.compareTo(o.plaka);
	}

}
