package com.bilgeadam.lesson015.set;

/*
 * bir kullanıcı ismi olsun 
 * email ve şifre olsun 
 * 
 * daha sonra test sınıfında kullanıcıları tutalım 
 * 
 * ve bu kullanıcalara yeni kullanıcı ekleyen bir metot yazacağız 
 * dışardan girilen bilgiler kontrol edilcek
 * ve aynı kullanıcı isimli biri daha once 
 * eklenmişsse bizden dogru veri gelene kadar veri almaya devam etsin  
 * 
 * 
 */
public class Kullanici {

	String kullaniciAdi;
	String email;
	String sifre;

	public Kullanici(String kullaniciAdi, String email, String sifre) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.email = email;
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Kullanici [kullaniciAdi=" + kullaniciAdi + ", email=" + email + ", sifre=" + sifre + "]";
	}

}
