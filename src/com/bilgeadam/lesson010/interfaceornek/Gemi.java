package com.bilgeadam.lesson010.interfaceornek;

public abstract class Gemi extends Arac implements IDenizTasiti {

	private int odaSayisi;

	@Override
	public void yelkenAc() {
		System.out.println("yelken acıldı");

	}

	@Override
	public void limanaYanas() {
		System.out.println("limana yanaşıldı");

	}

	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName() + " Hızlanıyor");
		hiz += 10;
		hizGoster();

	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName());
		if (hiz > 0) {
			System.out.println(this.getClass().getSimpleName() + " Yavaslıyor");
			hiz -= 10;
			hizGoster();
		}

	}

}
