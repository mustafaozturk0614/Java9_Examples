package com.bilgeadam.lesson010.interfaceornek;

public class Otomobil extends Arac implements IKaraTasiti {

	@Override
	public void sur() {
		System.out.println("Harekete geçildi");

	}

	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName() + " Hızlanıyor");
		hiz += 20;
		hizGoster();

	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName());
		if (hiz > 0) {
			System.out.println(this.getClass().getSimpleName() + " Yavaslıyor");
			hiz -= 20;
			hizGoster();
		}

	}

}
