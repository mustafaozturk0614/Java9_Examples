package com.bilgeadam.lesson025.singelton.eager;

public class Test {

	public static void main(String[] args) {

		EvHalkı anne = new EvHalkı();
		EvHalkı baba = new EvHalkı();
		EvHalkı cocuk = new EvHalkı();

		anne.start();
		baba.start();
		cocuk.start();

	}

}
