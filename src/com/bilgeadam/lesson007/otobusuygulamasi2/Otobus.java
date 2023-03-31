package com.bilgeadam.lesson007.otobusuygulamasi2;

public class Otobus {

	public String no;
	public String plaka;
	public String soforIsmi;
	public int yolcuKapasitesi;
	public Guzergah guzergah;
	public String marka;

	public Otobus(String no, String plaka, String soforIsmi, int yolcuKapasitesi, Guzergah guzergah, String marka) {
		this.no = no;
		this.plaka = plaka;
		this.soforIsmi = soforIsmi;
		this.yolcuKapasitesi = yolcuKapasitesi;
		this.guzergah = guzergah;
		this.marka = marka;
	}

	public Otobus(String no, String plaka, String soforIsmi, int yolcuKapasitesi, String marka) {
		this.no = no;
		this.plaka = plaka;
		this.soforIsmi = soforIsmi;
		this.yolcuKapasitesi = yolcuKapasitesi;
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "Otobus [no=" + no + ", plaka=" + plaka + ", soforIsmi=" + soforIsmi + ", yolcuKapasitesi="
				+ yolcuKapasitesi + ", guzergah=" + guzergah + ", marka=" + marka + "]";
	}

}
