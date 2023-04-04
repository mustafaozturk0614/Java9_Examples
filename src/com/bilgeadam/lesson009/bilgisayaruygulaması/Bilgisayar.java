package com.bilgeadam.lesson009.bilgisayaruygulaması;

import java.util.ArrayList;

public class Bilgisayar {

	private String id;
	private String ad;
	private AnaKart anaKart;
	private ArrayList<HariciDonanim> hariciDonanimlar;
	private boolean tasınabilirMi;

	public Bilgisayar(String id, String ad, AnaKart anaKart, ArrayList<HariciDonanim> hariciDonanimlar) {
		super();
		this.id = id;
		this.ad = ad;
		this.anaKart = anaKart;
		this.hariciDonanimlar = hariciDonanimlar;
	}

	public Bilgisayar(String id, String ad, AnaKart anaKart) {
		super();
		this.id = id;
		this.ad = ad;
		this.anaKart = anaKart;
	}

	public String getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}

	public AnaKart getAnaKart() {
		return anaKart;
	}

	public ArrayList<HariciDonanim> getHariciDonanimlar() {
		return hariciDonanimlar;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setAnaKart(AnaKart anaKart) {
		this.anaKart = anaKart;
	}

	public void setHariciDonanimlar(ArrayList<HariciDonanim> hariciDonanimlar) {
		this.hariciDonanimlar = hariciDonanimlar;
	}

	public boolean isTasınabilirMi() {
		return tasınabilirMi;
	}

	public void setTasınabilirMi(boolean tasınabilirMi) {
		this.tasınabilirMi = tasınabilirMi;
	}

	@Override
	public String toString() {
		return "Bilgisayar [id=" + id + ", ad=" + ad + ", anaKart=" + anaKart + ", hariciDonanimlar=" + hariciDonanimlar
				+ ", tasınabilirMi=" + tasınabilirMi + "]";
	}

}
