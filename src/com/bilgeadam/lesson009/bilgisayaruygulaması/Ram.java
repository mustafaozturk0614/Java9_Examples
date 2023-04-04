package com.bilgeadam.lesson009.bilgisayaruygulaması;

public class Ram extends DahiliDonanim {

	private int boyut;
	private int hiz;

	public Ram(int boyut, int hiz) {
		super();
		this.boyut = boyut;
		this.hiz = hiz;
	}

	public int getBoyut() {
		return boyut;
	}

	public int getHiz() {
		return hiz;
	}

	public void setBoyut(int boyut) {
		this.boyut = boyut;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	@Override
	public String toString() {
		return "Ram [boyut=" + boyut + ", hiz=" + hiz + "]";
	}

}
