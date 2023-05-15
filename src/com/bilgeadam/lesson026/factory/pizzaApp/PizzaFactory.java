package com.bilgeadam.lesson026.factory.pizzaApp;

public class PizzaFactory {

	public static Pizza pizzaOlustur(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {

		switch (tur) {
		case TONBALIKLI, KARISIK:
			return new KlasikPizza(tur, boyut, hamurTipi);
		case AKDENİZ:
			return new VeganPizza(tur, boyut, hamurTipi);
		default:

			throw new RuntimeException("Hatalı secim yaptınız....");
		}

	}

}
