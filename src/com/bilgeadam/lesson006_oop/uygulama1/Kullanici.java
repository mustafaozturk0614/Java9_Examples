package com.bilgeadam.lesson006_oop.uygulama1;

/*
 * 
 * alt+shihft+s
 */
public class Kullanici {

	private int id;
	private String isim;
	private String email;
	private String sifre;
	private String telefonNo;
	private String username;

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

	public Kullanici(String isim, String email, String sifre, String telefonNo, String username) {
		super();
		this.isim = isim;
		this.email = email;
		this.sifre = sifre;
		this.telefonNo = telefonNo;
		this.username = username;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
