package com.bilgeadam.lesson007.otobusuygulamasi;

public class Durak {

	private int durakNo;
	private String durakIsmi;
	private String konum;
	private Otobus[] otobusler;

	public Durak(int durakNo, String durakIsmi, String konum, Otobus[] otobusler) {
		this.durakNo = durakNo;
		this.durakIsmi = durakIsmi;
		this.konum = konum;
		this.otobusler = otobusler;
	}

	public Durak(int durakNo, String durakIsmi, String konum) {
		this.durakNo = durakNo;
		this.durakIsmi = durakIsmi;
		this.konum = konum;
	}

	public int getDurakNo() {
		return durakNo;
	}

	public void setDurakNo(int durakNo) {
		this.durakNo = durakNo;
	}

	public String getDurakIsmi() {
		return durakIsmi;
	}

	public void setDurakIsmi(String durakIsmi) {
		this.durakIsmi = durakIsmi;
	}

	public String getKonum() {
		return konum;
	}

	public void setKonum(String konum) {
		this.konum = konum;
	}

	public Otobus[] getOtobusler() {
		return otobusler;
	}

	public void setOtobusler(Otobus[] otobusler) {
		this.otobusler = otobusler;
	}

	@Override
	public String toString() {
		return "Durak [durakNo=" + durakNo + ", durakIsmi=" + durakIsmi + ", konum=" + konum + "]";
	}

}
