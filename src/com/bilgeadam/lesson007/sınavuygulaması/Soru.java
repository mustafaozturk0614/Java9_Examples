package com.bilgeadam.lesson007.sınavuygulaması;

import java.util.Arrays;
import java.util.Scanner;

public class Soru {

	public int puan;
	public int sıraNo;
	public String icerik;
	public String dogruCevabı;// A,B,C,D
	public String[] cevapIcerikleri; // ==> a) Türkiyenin baskenti Ankaradır.

	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir Soru içeriği giriniz");
		this.icerik = scanner.nextLine();
		this.cevapIcerikleri = new String[cevapSecenekleri.length];// 4

		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println("Lütfen" + cevapSecenekleri[i] + "şıkkının içeriğini giriniz");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		System.out.println("Sorunun dogru cevabını belirleryiniz");
		this.dogruCevabı = scanner.nextLine();
		System.out.println("Lütfen sorunun puanını giriniz");
		this.puan = Integer.parseInt(scanner.nextLine());

	}

	@Override
	public String toString() {
		return "Soru [puan=" + puan + ", sıraNo=" + sıraNo + ", icerik=" + icerik + ", dogruCevabı=" + dogruCevabı
				+ ", cevapIcerikleri=" + Arrays.toString(cevapIcerikleri) + "]";
	}

}
