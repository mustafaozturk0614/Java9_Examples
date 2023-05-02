package com.bilgeadam.lesson022.yuzmetrekosu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class YuzMetreYaris {

	public static void main(String[] args) {
		long baslangicZamani = System.currentTimeMillis();
		Kosucu kosucu1 = new Kosucu("Mustafa", baslangicZamani);
		Kosucu kosucu2 = new Kosucu("Mert", baslangicZamani);
		Kosucu kosucu3 = new Kosucu("Berkin", baslangicZamani);
		Kosucu kosucu4 = new Kosucu("Arda", baslangicZamani);
		Kosucu kosucu5 = new Kosucu("Murat", baslangicZamani);

		Thread thread1 = new Thread(kosucu1);
		Thread thread2 = new Thread(kosucu2);
		Thread thread3 = new Thread(kosucu3);
		Thread thread4 = new Thread(kosucu4);
		Thread thread5 = new Thread(kosucu5);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Kosucu> kosucular = new ArrayList<>(List.of(kosucu1, kosucu2, kosucu3, kosucu4, kosucu5));

		kosucular.stream().sorted(Comparator.comparingLong(x -> x.getSure())).forEach(System.out::println);

	}

}
