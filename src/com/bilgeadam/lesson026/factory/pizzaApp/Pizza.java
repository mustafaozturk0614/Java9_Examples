package com.bilgeadam.lesson026.factory.pizzaApp;

/*
 * 
 * Boyutu
 * Hamurtipi
 * tur
 * fiyatı
 * 
 * 2 tane alt sınıf olusturalım VegenPizza KlasikPizza gibi
 * daha sonra bir factory sınıf olusturacagız 
 * pizza sec metodunda yaptıgımız secimlere gore factory sınıfı bize bir pizza olusturacak  
 * 
 * Pizza siprais sınıfı olusturacagız burda kullanıcadan pizzanın ozelliklerini secmesini istiyecegğiz
 * 
 * bu bilgilerle beraber bize bir pizza hazrılanacak 
 * 
 */
public abstract class Pizza {

	private double fiyat;
	private ETur tur;
	private EBoyut boyut;
	private EHamurTipi hamurTipi;

	public Pizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super();
		this.tur = tur;
		this.boyut = boyut;
		this.hamurTipi = hamurTipi;
	}

	public Pizza(double fiyat, ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super();
		this.fiyat = fiyat;
		this.tur = tur;
		this.boyut = boyut;
		this.hamurTipi = hamurTipi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public ETur getTur() {
		return tur;
	}

	public EBoyut getBoyut() {
		return boyut;
	}

	public EHamurTipi getHamurTipi() {
		return hamurTipi;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public void setTur(ETur tur) {
		this.tur = tur;
	}

	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}

	public void setHamurTipi(EHamurTipi hamurTipi) {
		this.hamurTipi = hamurTipi;
	}

}
