package com.bilgeadam.lesson010.interfaceornek;

public class Kamyon extends Arac implements IKaraTasiti, IYuk {

	private String dorseTipi;
	private int kasaUzunlugu;

	@Override
	public void sur() {
		System.out.println("Harekete geçildi");

	}

	@Override
	public void yukAl() {
		System.out.println("Kamyon yuk aldı");

	}

	@Override
	public void yukBosalt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName() + " Hızlanıyor");
		hiz += 5;
		hizGoster();

	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName());
		if (hiz > 0) {
			System.out.println(this.getClass().getSimpleName() + " Yavaslıyor");
			hiz -= 5;
			hizGoster();
		}

	}

}
