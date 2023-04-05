package com.bilgeadam.lesson010.interfaceornek;

public class Helikopter extends Arac implements IHavaTasiti {

	@Override
	public void kalkisYap() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Kalkış yapıldı");

	}

	@Override
	public void inisYap() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("İniş yapıldı");

	}

	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName() + " Hızlanıyor");
		hiz += 40;
		hizGoster();

	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName());
		if (hiz > 0) {
			System.out.println(this.getClass().getSimpleName() + " Yavaslıyor");
			hiz -= 40;
			hizGoster();
		}

	}

}
