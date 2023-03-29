package com.bilgeadam.lesson006_oop.uygulama1;

/*
 * 
 * alt+shihft+s
 */
public class Kullanici {

	public int id;
	public String isim;
	public String email;
	public String sifre;
	public String telefonNo;
	public String username;

	public Kullanici() {

	}

	public Kullanici(int id, String isim, String email, String sifre, String username) {
		super();
		this.id = id;
		this.isim = isim;
		this.email = email;
		this.sifre = sifre;
		this.username = username;
	}

	public Kullanici(int id, String isim, String email, String sifre, String telefonNo, String username) {
		super();
		this.id = id;
		this.isim = isim;
		this.email = email;
		this.sifre = sifre;
		this.telefonNo = telefonNo;
		this.username = username;
	}

}
