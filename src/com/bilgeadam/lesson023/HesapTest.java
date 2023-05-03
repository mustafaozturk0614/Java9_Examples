package com.bilgeadam.lesson023;

public class HesapTest {

	public static void main(String[] args) {
		Hesap hesap = new Hesap();

		Thread thread1 = new Thread(() -> {

			for (int i = 0; i < 20; i++) {
				hesap.paraCek(5000);
			}

		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				hesap.paraYatir(5000);
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

		System.out.println("Hesaptaki para" + hesap.bakiye);

	}

}
