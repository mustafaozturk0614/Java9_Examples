package com.bilgeadam.lesson022.taksiapp;
/*
 * Taksileimiz her biri bir thread olacak 
 * 
 * taksilerde ==> id ,aldıgı musteri sayısı, aldıgı musterilerin idlerini tutan bir 
 * liste ,bekleme suresi 
 * 
 *  bekleme suresini random bir long degeri olsun 1000-5000 arasında olsun
 *  
 *  bir durağımız olacak durağımızda taksilerimiz var
 *  birde musteri kuyrugu ==> bu yapıda musterilerileriizn idsini tutacağız
 *  yapımızda 100 tane musterimiz olsun
 *  durak ta da  10 tane taksimiz olsun  
 * 
 * kuyrugumuz bosalana kadar taksilerimiz sıra ile kuyrgumuzdan musterileri alsın 
 * 
 * 
 * kuyrukdan aldıgı musteri nosunu kendi içinde tuttgu musterinoları 
 * listesine eklesin 
 * 1. nolu taksi--->5.müsterisini aldı --> musteri idsi 8;
 * dongumuz sona erdiğinde 
 * 1 nolu taksı toplamda 20 musteri aldı ve mesaisi sona erdi
 * 2 nolu taksı toplamda 20 musteri aldı ve mesaisi sona erdi
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Taksi implements Runnable {

	private int id;
	private int musteriSayisi;
	private List<Integer> musteriNolar;
	private long beklemeSuresi;

	public Taksi(int id) {
		this.id = id;
		this.beklemeSuresi = beklemeSuresiAta();
		this.musteriNolar = new ArrayList<>();
	}

	private long beklemeSuresiAta() {
		Random random = new Random();
		return random.nextLong(1000, 5000);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(beklemeSuresi);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (!Durak.getMusteriler().isEmpty()) {

			int musteriId = Durak.getMusteriler().poll();
			musteriNolar.add(musteriId);
			musteriSayisi = musteriNolar.size();
			System.out.println(
					id + " nolu Taksi" + (musteriSayisi) + ".musterisini aldı ---> musteri idsi---->" + musteriId);
			try {
				Thread.sleep(beklemeSuresi);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(id + " li taksi toplamda" + musteriSayisi + " musteri aldı ve mesaisi sona erdi");

	}

	@Override
	public String toString() {
		return "Taksi [id=" + id + ", musteriSayisi=" + musteriSayisi + ", musteriNolar=" + musteriNolar
				+ ", beklemeSuresi=" + beklemeSuresi + "]";
	}

}
