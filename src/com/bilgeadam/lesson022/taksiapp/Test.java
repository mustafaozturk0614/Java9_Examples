package com.bilgeadam.lesson022.taksiapp;

public class Test {

	public static void main(String[] args) {
		Durak durak = new Durak();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(durak.getTaksiler().get(i));
			thread.start();
		}

	}

}
