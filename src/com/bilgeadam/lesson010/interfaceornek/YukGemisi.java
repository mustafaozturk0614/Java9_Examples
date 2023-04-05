package com.bilgeadam.lesson010.interfaceornek;

public class YukGemisi extends Gemi implements IYuk {

	@Override
	public void yukAl() {
		System.out.println("Gemi Yuk aldı");

	}

	@Override
	public void yukBosalt() {
		System.out.println("Gemi Yuk bosalttı");

	}

}
