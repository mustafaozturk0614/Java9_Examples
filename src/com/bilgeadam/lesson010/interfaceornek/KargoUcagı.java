package com.bilgeadam.lesson010.interfaceornek;

public class KargoUcagı extends Ucak implements IYuk {

	@Override
	public void yukAl() {
		System.out.println("Ucak Yuk aldı");

	}

	@Override
	public void yukBosalt() {
		System.out.println("Ucak Yuk bosalttı");

	}

}
