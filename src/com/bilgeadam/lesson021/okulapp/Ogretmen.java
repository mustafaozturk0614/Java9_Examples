package com.bilgeadam.lesson021.okulapp;
/*
 * 1- ogretmen sınıfımız soyutlayalım 
 * 2- yine ogrencileri txt den okuyup olusturalım ve ogretmen içinde bir yapıda tutatlım
 * 3- bu ogrencileri ogretmenin adıyla olusturulmus bir dosyada saklayalım 
 * 
 * 
 */

import java.io.BufferedReader;
import java.util.List;

public class Ogretmen extends Thread {

	private List<Ogrenci> ogrenciler;
	private String isim;
	BufferedReader bufferedReader;

	public Ogretmen(String isim, BufferedReader bufferedReader) {
		super();
		this.isim = isim;
		this.bufferedReader = bufferedReader;
	}

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public String getIsim() {
		return isim;
	}

	@Override
	public String toString() {
		return "Ogretmen [ogrenciler=" + ogrenciler + ", isim=" + isim + "]";
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void ogrencileriKaydet() {

		FileManager.ogretmenDosyasiOlustur(ogrenciler, isim);

	}

	public void ogrenciNotlarıOku() {
		ogrenciler = FileManager.dosyadanVeriOku(bufferedReader, isim);
	}

	public void dosyadanOku() {
		ogrenciler = FileManager.ogrencileriGetir(isim);
	}

	public void notEkleVeKaydet(double not) {
		double toplam = 0;
		for (Ogrenci ogrenci : ogrenciler) {
			toplam = (ogrenci.getOrtalama() * 3);
			toplam += not;
			ogrenci.setOrtalama(toplam / 4);
			ogrenci.durumBelirle(toplam / 4);
		}

		ogrencileriKaydet();

	}

	@Override
	public void run() {

		ogrenciNotlarıOku();
	}

}
