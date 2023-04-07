package com.bilgeadam.lesson011.databseornekabstract;

public class Oracle extends Database {

	@Override
	public void ekle() {
		System.out.println("Oracle veri tabanına veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Oracle veri tabanından veri silindi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Oracle veri tabanından veriler getirildi");

	}

	@Override
	public void guncelle() {
		System.out.println("Oracle veri tabanındanda veri guncellendi");

	}

	@Override
	public void login() {
		System.out.println("Oracle veri tabanına baglanıldı");

	}

}
