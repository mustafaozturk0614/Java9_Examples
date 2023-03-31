package com.bilgeadam.lesson007.otobusuygulamasi2;

import java.util.Arrays;

public class Guzergah {

	public Durak[] duraklar;
	public int hatNo;

	public Guzergah(Durak[] duraklar, int hatNo) {
		this.duraklar = duraklar;
		this.hatNo = hatNo;
	}

	public Guzergah(int hatNo) {

		this.hatNo = hatNo;
		this.duraklar = new Durak[5];
	}

	@Override
	public String toString() {
		return "Guzergah [duraklar=" + Arrays.toString(duraklar) + ", hatNo=" + hatNo + "]";
	}

}
