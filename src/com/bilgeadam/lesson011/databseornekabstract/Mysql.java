package com.bilgeadam.lesson011.databseornekabstract;

public class Mysql extends Database {

	@Override
	public void ekle() {
		System.out.println("Mysql veri tabanına veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Mysql veri tabanından veri silindi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Mysql veri tabanından veriler getirildi");

	}

	@Override
	public void guncelle() {
		System.out.println("Mysql veri tabanındanda veri guncellendi");

	}

	@Override
	public void login() {
		System.out.println("Mysql veri tabanına baglanıldı");

	}

}
