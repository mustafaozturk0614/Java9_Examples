package com.bilgeadam.lesson007.otobusuygulamasi;

import java.util.Arrays;

public class Guzergah {

	private Durak[] duraklar;
	private int hatNo;

	public Guzergah(Durak[] duraklar, int hatNo) {
		this.duraklar = duraklar;
		this.hatNo = hatNo;
	}

	public Guzergah(int hatNo) {
		this.hatNo = hatNo;
	}

	public Durak[] getDuraklar() {
		return duraklar;
	}

	public void setDuraklar(Durak[] duraklar) {
		this.duraklar = duraklar;
	}

	public int getHatNo() {
		return hatNo;
	}

	public void setHatNo(int hatNo) {
		this.hatNo = hatNo;
	}

	@Override
	public String toString() {
		return "Guzergah [duraklar=" + Arrays.toString(duraklar) + ", hatNo=" + hatNo + "]";
	}

}
