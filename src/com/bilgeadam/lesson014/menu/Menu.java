package com.bilgeadam.lesson014.menu;

/*
 * 
 * Menu diye bir sınıfımız olacak 
 * 
 * Corbalar ,Icecekler Yemekler ve Tatlılar  her biri için bi Enum olusturacagız
 * 
 * icecek sayımız  7 olsun Ayran kola fanta gazoz meyvesuyu limonata icetea
 * 
 * menu sınfını içinde kullanacagız 
 * 
 * gunlerimiz olacak bunu da bir enum yapabilirsiniz
 * 
 * manager sınıfımızda her gune random bir menu belirleyeceğiz
 * her gun random bir çorba içecek yemek ve tatlı sırayla pazartesiden pazara olsun 
 * başta farklı gunlerde aynı degerler cıkabilir.
 * 
 * 
 *extra
 *içeceklerimiz her gune sadece bir içecek gelecek sekilde haftanın bir gunu kola geldiyse 
 *2. defa kola gelmesin   
 *  
 * 
 * 
 * Pojo
 * 
 * 
 */
public class Menu {

	private ECorba corba;
	private EYemek yemek;
	private ETatli tatli;
	private EIcecek icecek;

	public Menu(ECorba corba, EYemek yemek, ETatli tatli, EIcecek icecek) {
		super();
		this.corba = corba;
		this.yemek = yemek;
		this.tatli = tatli;
		this.icecek = icecek;
	}

	public ECorba getCorba() {
		return corba;
	}

	public EYemek getYemek() {
		return yemek;
	}

	public ETatli getTatli() {
		return tatli;
	}

	public EIcecek getIcecek() {
		return icecek;
	}

	public void setCorba(ECorba corba) {
		this.corba = corba;
	}

	public void setYemek(EYemek yemek) {
		this.yemek = yemek;
	}

	public void setTatli(ETatli tatli) {
		this.tatli = tatli;
	}

	public void setIcecek(EIcecek icecek) {
		this.icecek = icecek;
	}

	@Override
	public String toString() {
		return "Menu [corba=" + corba + ", yemek=" + yemek + ", tatli=" + tatli + ", icecek=" + icecek + "]";
	}

}
