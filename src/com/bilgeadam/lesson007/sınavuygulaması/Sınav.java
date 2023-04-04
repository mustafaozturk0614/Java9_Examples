package com.bilgeadam.lesson007.sınavuygulaması;

import java.util.Scanner;

/*
 * sınavolustur() => metodumuz olacak  Sınav sınıfında
 * dışardan gereken verileri alacak sınav konusu soru sayısı gibi..
 * bu metotta sorularıda olusturmak gerekcek bu soru olusturma işini soru sınıfından bir metodo devredeceğiz
 * Soru sınıfında bir soru olusturma metodu yazalım 
 * sourolustur()==> dışardan soru ile ilgili verileri alacak  içerik, puan ,cevap içerikleri gibi 
 * ve içerde cevap içeriklerinide kullanıcıdan alacagız 
 * bu iki metot sayasinde sınavımız olusmus olacak 
 * 
 * Sınav sınıfında olusturalım
 * daha sonra sınav sınıfında cavapları gir diye bir metodumuz olacak bu metot 
 * sınav sorularını sıra ile gösterirken bizden cevapları alacak 
 * 
 * daha sonra başka bir metot daha yazıp (cevaplarıKontrolEt) bi onceki metot dan aldıgımız cevapları 
 * soruların dogru cevabı ile kontrol edip sınav puanımızı hesaplayan bir metot olacak   
 * 
 */
public class Sınav {

	public String ders;
	public String konu;
	public int soruSayisi;
	public long sure;
	public Soru[] sorular;
	public String[] cevaplar;
	public String[] cevapSecenekleri = { "A", "B", "C", "D" };// A,B,C,D

	public void sinavOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir ders giriniz");
		this.ders = scanner.nextLine();
		System.out.println("Lütfen Bir sınav konus giriniz");
		this.konu = scanner.nextLine();
		System.out.println("Lütfen Soru Sayisini giriniz  giriniz");
//		this.soruSayisi = scanner.nextInt();
//		scanner.nextLine();
		this.soruSayisi = Integer.parseInt(scanner.nextLine());
		System.out.println("Lütfen sınav suresini giriniz");
		this.sure = Long.parseLong(scanner.nextLine());
		sorular = new Soru[soruSayisi];
		for (int i = 0; i < soruSayisi; i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			soru.sıraNo = i + 1;
			sorular[i] = soru;
		}

	}

	public void cevaplariGir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ders= " + this.ders);
		System.out.println("Konu= " + this.konu);
		System.out.println("Sure= " + this.sure);
		this.cevaplar = new String[soruSayisi];
		for (int i = 0; i < sorular.length; i++) {
			System.out.println(sorular[i].icerik);//

			for (int j = 0; j < sorular[i].cevapIcerikleri.length; j++) {
				System.out.println(cevapSecenekleri[j] + "-)" + sorular[i].cevapIcerikleri[j]);
			}
			System.out.println("Lütfen cevabınızı giriniz (A,B,C,D olacak şekilde)");
			cevaplar[i] = scanner.nextLine().toUpperCase();
		}
	}

	public void cevaplarıKontrolEt() {
		int dogruSayisi = 0;
		int puan = 0;

		for (int i = 0; i < sorular.length; i++) {
			if (cevaplar[i].equals(sorular[i].dogruCevabı)) {
				dogruSayisi++;
				puan += sorular[i].puan;
			}
		}

		System.out.println("dogru cevapsayınız= " + dogruSayisi);
		System.out.println("yanlış cevapsayınız= " + (soruSayisi - dogruSayisi));
		System.out.println("toplam puan= " + puan);

	}
}
