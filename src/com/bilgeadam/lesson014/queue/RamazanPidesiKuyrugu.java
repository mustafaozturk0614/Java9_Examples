package com.bilgeadam.lesson014.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * String bir kuyruk tanımlıyacagız 
 * 
 * bu kuyruga 10 tane isim ekleyeceğiz 
 * 
 * 
 * random 1-10 arası sayı uretecegız  buda bizim pide sayımız olucak
 * 
 * kuruga gore pideleri dagıtacagız  pide bittiğinde pide bitti yazalım 
 * birde pide alamayanları yazdıralım 
 * 
 * 
 * 
 * 
 */

public class RamazanPidesiKuyrugu {

	Queue<String> kuyruk = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) throws InterruptedException {

		RamazanPidesiKuyrugu ramazanPidesiKuyrugu = new RamazanPidesiKuyrugu();
		ramazanPidesiKuyrugu.kuyrukOlustur();
		ramazanPidesiKuyrugu.pideDagıt();
		ramazanPidesiKuyrugu.geriyeKalanlar();
		// ramazanPidesiKuyrugu.kuyruk.forEach(System.out::println);

	}

	public void kuyrukOlustur() {

		kuyruk.offer("Ahmet");
		kuyruk.offer("Murat");
		kuyruk.offer("Ozan");
		kuyruk.offer("Hasan");
		kuyruk.offer("Merve");
		kuyruk.offer("Hilal");
		kuyruk.offer("Mustafa");
		kuyruk.offer("Ezgi");
		kuyruk.offer("Selim");
		kuyruk.offer("Çiğdem");
		// kuyruk.offer("XXX");
		// kuyruk.add("Çiğdem"); // add ile eklersek kuyrugun boyutu 10 oldugundan
		// kuyruk boyutu aşılır ve hata
		// fırlatır
		// offer ile eklersek donus tipi null olur hata fırlatmaz

	}

	public void pideDagıt() throws InterruptedException {
		Random random = new Random();
		int pideSayısı = random.nextInt(1, 11);
		System.out.println("Pideler Cıkıyor");
		System.out.println("pide sayısı==>" + pideSayısı);
		Thread.sleep(2000);
		for (int i = 0; i < pideSayısı; i++) {
			if (!kuyruk.isEmpty()) {
				Thread.sleep(500);
				System.out.println(kuyruk.poll() + " pidesini aldı");
			} else {
				System.out.println("Müşteri kalmadı !!!!");
				break;
			}
		}
	}

	public void geriyeKalanlar() {

		if (kuyruk.isEmpty()) {
			System.out.println("Pidesini almayan musteri kalmadı");
		} else {
			System.out.println("Pide bitti Pidesini alamaayn musteriler");
			kuyruk.forEach(System.out::println);
		}
	}
}
