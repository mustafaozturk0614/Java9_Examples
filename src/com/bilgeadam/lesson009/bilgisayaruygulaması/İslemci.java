package com.bilgeadam.lesson009.bilgisayaruygulaması;

public class İslemci extends DahiliDonanim {

	private int cekirdekSayisi;
	private int hiz;
	private String nesil;

	public İslemci(int cekirdekSayisi, int hiz, String nesil) {
		super();
		this.cekirdekSayisi = cekirdekSayisi;
		this.hiz = hiz;
		this.nesil = nesil;
	}

	public int getCekirdekSayisi() {
		return cekirdekSayisi;
	}

	public int getHiz() {
		return hiz;
	}

	public String getNesil() {
		return nesil;
	}

	public void setCekirdekSayisi(int cekirdekSayisi) {
		this.cekirdekSayisi = cekirdekSayisi;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public void setNesil(String nesil) {
		this.nesil = nesil;
	}

	@Override
	public String toString() {
		return "İslemci [cekirdekSayisi=" + cekirdekSayisi + ", hiz=" + hiz + ", nesil=" + nesil + "]";
	}

}
