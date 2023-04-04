package com.bilgeadam.lesson009.bilgisayaruygulaması;

public class HardDisk extends DahiliDonanim {

	private int kapasite;
	private int yazmaHizi;
	private int okumaHizi;

	public HardDisk(int kapasite, int yazmaHizi, int okumaHizi) {
		super();
		this.kapasite = kapasite;
		this.yazmaHizi = yazmaHizi;
		this.okumaHizi = okumaHizi;
	}

	public int getKapasite() {
		return kapasite;
	}

	public int getYazmaHizi() {
		return yazmaHizi;
	}

	public int getOkumaHizi() {
		return okumaHizi;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	public void setYazmaHizi(int yazmaHizi) {
		this.yazmaHizi = yazmaHizi;
	}

	public void setOkumaHizi(int okumaHizi) {
		this.okumaHizi = okumaHizi;
	}

	@Override
	public String toString() {
		return "HardDisk [kapasite=" + kapasite + ", yazmaHizi=" + yazmaHizi + ", okumaHizi=" + okumaHizi + "]";
	}

}
