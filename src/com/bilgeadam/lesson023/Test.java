package com.bilgeadam.lesson023;

public class Test {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {

			for (int i = 0; i < 500; i++) {
				Product.urunSat();
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				Product.urunSat();
			}
		});

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Product.stockValue);
	}

}
