package com.bilgeadam.lesson009.bilgisayaruygulaması;

import java.util.ArrayList;

public class MasaustuBilgisayar extends Bilgisayar {

	private int kasaBoyutu;
	private Monitor monitor;

	public MasaustuBilgisayar(String id, String ad, AnaKart anaKart, ArrayList<HariciDonanim> hariciDonanimlar,
			int kasaBoyutu, Monitor monitor) {
		super(id, ad, anaKart, hariciDonanimlar);
		this.kasaBoyutu = kasaBoyutu;
		this.monitor = monitor;
		setTasınabilirMi(false);
	}

	public MasaustuBilgisayar(String id, String ad, AnaKart anaKart, int kasaBoyutu, Monitor monitor) {
		super(id, ad, anaKart);
		this.kasaBoyutu = kasaBoyutu;
		this.monitor = monitor;
		setTasınabilirMi(false);
	}

	public int getKasaBoyutu() {
		return kasaBoyutu;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setKasaBoyutu(int kasaBoyutu) {
		this.kasaBoyutu = kasaBoyutu;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

}
