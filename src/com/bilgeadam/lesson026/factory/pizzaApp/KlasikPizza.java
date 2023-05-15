package com.bilgeadam.lesson026.factory.pizzaApp;

public class KlasikPizza extends Pizza {

	public KlasikPizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super(tur, boyut, hamurTipi);

	}

	public KlasikPizza(double fiyat, ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super(fiyat, tur, boyut, hamurTipi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KlasikPizza [getFiyat()=" + getFiyat() + ", getTur()=" + getTur() + ", getBoyut()=" + getBoyut()
				+ ", getHamurTipi()=" + getHamurTipi() + "]";
	}

}
