package com.bilgeadam.lesson017.sanslinumaralar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ogrenci {

	private int id;
	private String isim;
	private String bolum;
	private String durum;
	private List<Double> notlar;

	public Ogrenci(int id, String isim, String bolum) {
		super();
		this.id = id;
		this.isim = isim;
		this.bolum = bolum;
		this.notlar = new ArrayList<>();
	}

	public double notOrtHesapla() {
		return notlar.stream().collect(Collectors.averagingDouble(n -> n));
	}

	public int getId() {
		return id;
	}

	public String getIsim() {
		return isim;
	}

	public String getBolum() {
		return bolum;
	}

	public String getDurum() {
		return durum;
	}

	public List<Double> getNotlar() {
		return notlar;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public void setNotlar(List<Double> notlar) {
		this.notlar = notlar;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", isim=" + isim + ", bolum=" + bolum + ", durum=" + durum + ", notlar=" + notlar
				+ "]";
	}

}
