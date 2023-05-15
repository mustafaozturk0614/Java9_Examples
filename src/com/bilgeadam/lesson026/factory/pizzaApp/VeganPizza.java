package com.bilgeadam.lesson026.factory.pizzaApp;

public class VeganPizza extends Pizza {

	public VeganPizza(double fiyat, ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super(fiyat, tur, boyut, hamurTipi);
		// TODO Auto-generated constructor stub
	}

	public VeganPizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super(tur, boyut, hamurTipi);
		// TODO Auto-generated constructor stub
	}

}
