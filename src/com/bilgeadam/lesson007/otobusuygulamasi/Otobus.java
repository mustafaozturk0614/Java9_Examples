package com.bilgeadam.lesson007.otobusuygulamasi;

public class Otobus {

	private String no;
	private String plaka;
	private String soforIsmi;
	private int yolcuKapasitesi;
	private Guzergah guzergah;
	private String marka;

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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public String getSoforIsmi() {
		return soforIsmi;
	}

	public void setSoforIsmi(String soforIsmi) {
		this.soforIsmi = soforIsmi;
	}

	public int getYolcuKapasitesi() {
		return yolcuKapasitesi;
	}

	public void setYolcuKapasitesi(int yolcuKapasitesi) {
		this.yolcuKapasitesi = yolcuKapasitesi;
	}

	public Guzergah getGuzergah() {
		return guzergah;
	}

	public void setGuzergah(Guzergah guzergah) {
		this.guzergah = guzergah;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "Otobus [no=" + no + ", plaka=" + plaka + ", soforIsmi=" + soforIsmi + ", yolcuKapasitesi="
				+ yolcuKapasitesi + ", guzergah=" + guzergah + ", marka=" + marka + "]";
	}

}
