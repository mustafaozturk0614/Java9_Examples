package com.bilgeadam.lesson022.yuzmetrekosu;

/*
 * Kosucu bir thread olacak
 * kosucunun ismi ,mesafe ,sure ,baslangıczamanı
 * 
 * thread için bir metot yazacagız ==> 
 * kosucu 100 metre koşacak 
 * 1 er 1 er mesefa alacak
 * her 1 mesafe aldıgınde 200 milisaniye program beklesin 
 * ve her 10 metrede 1 prgram çıktı verecek==>
 * mustafa -->10. metrede
 * mustafa -->20. metrede
 * ....
 * metodun sonundada mustafa adlı kosucu 100 metreyi 20000 milisaniyede koştu
 * 
 * 
 * Yuz metre yarışı sınıfı olusturup 5 tane kosucu olusturalım ve yarısımız baslasın 
 * 
 * 
 */
public class Kosucu implements Runnable {

	private String isim;

	private int mesafe;

	private long sure;

	private long baslangicZamani;

	public Kosucu(String isim) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.sure = 0;
		this.baslangicZamani = System.currentTimeMillis();
	}

	public Kosucu(String isim, long baslangicZamani) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.sure = 0;
		this.baslangicZamani = baslangicZamani;
	}

	@Override
	public void run() {

		while (mesafe < 100) {
			mesafe++;

			if (mesafe % 10 == 0) {
				System.out.println(isim + "---->" + mesafe + ".metrede");
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		long bitisZamani = System.currentTimeMillis();
		System.out.println(bitisZamani);
		this.sure = bitisZamani - baslangicZamani;
		System.out.println(isim + " adlı kosucu 100 metreyi " + (sure) + " ms de kosmustur");
	}

	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangicZamani=" + baslangicZamani
				+ "]";
	}

	public String getIsim() {
		return isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public long getSure() {
		return sure;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

}
