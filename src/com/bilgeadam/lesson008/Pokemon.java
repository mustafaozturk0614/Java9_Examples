package com.bilgeadam.lesson008;

public class Pokemon {

	private long id;
	private String ad;
	private String tur;
	private int seviye;
	private int guc;
	private int can;

	public Pokemon(long id, String ad, String tur, int seviye, int guc, int can) {
		this.ad = ad;
		this.id = id;
		this.tur = tur;
		this.seviye = seviye;
		this.guc = guc;
		this.can = can;
	}

	public Pokemon(long id, String ad) {
		this(id, ad, "Standart", 1, 200, 100);
		this.id = id;
		this.ad = ad;

	}

	public Pokemon(long id, String ad, int seviye, int guc, int can) {
		this.id = id;
		this.ad = ad;
		this.seviye = seviye;
		this.guc = guc;
		this.can = can;
		this.tur = "Standart";
	}

	public void saldir() {

		System.out.println(ad + " adlı pokemon saldırıyor");

	}

	public void kacinma() {
		System.out.println(ad + " adlı pokemon saldırıdan kaçındı");
	}

	public void pokedex() {
		System.out.println("POKEDEX");
		System.out.println("==============");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("tür= " + tur);
		System.out.println("can= " + can);
		System.out.println("güç= " + guc);
		System.out.println("seviye= " + seviye);

	}

	public long getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}

	public String getTur() {
		return tur;
	}

	public int getSeviye() {
		return seviye;
	}

	public int getGuc() {
		return guc;
	}

	public int getCan() {
		return can;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public void setCan(int can) {
		this.can = can;
	}

}
