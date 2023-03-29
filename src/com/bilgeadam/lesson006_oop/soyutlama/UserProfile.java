package com.bilgeadam.lesson006_oop.soyutlama;

public class UserProfile {
	int id;
	String avatar;
	String username;
	int takipSayisi;
	int takipciSayısı;
	Post[] postlar;
	int postSayısı;

	public void profiliDuzenle() {

		System.out.println("Profil Düzenlendi");
	}

	public void postOlustur() {
		System.out.println("Post oluşturuldu");
	}
}
