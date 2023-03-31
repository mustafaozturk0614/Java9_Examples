package com.bilgeadam.lesson007.sınavuygulaması;

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

}
