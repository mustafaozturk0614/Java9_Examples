package com.bilgeadam.lesson010.interfaceornek;

public abstract class Ucak extends Arac implements IHavaTasiti {

	int kanatUzunlugu;

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
		hiz += 50;
		hizGoster();

	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName());
		if (hiz > 0) {
			System.out.println(this.getClass().getSimpleName() + " Yavaslıyor");
			hiz -= 50;
			hizGoster();
		}

	}

}
