package com.bilgeadam.lesson006_oop;

/*
 * öğrencinin iki tane  özelliği olsun
 * isim ve numara
 * daha sonra birde kayıt metodu yazalım ==> 
 * Mustafa isimli öğrenci başarı ile kayıt olmustur Öğrenci numarası 1 dir.
 * 
 *   
 * 
 */
public class Student {

	public String ad;
	public static int index;
	public int no;

	public void kayit() {
		index++;
		no = index;
		System.out.println("===================");
		System.out.println(ad + " isimli öğrenci başarı ile kayıt olmustur");
		System.out.println("Öğrenci numarası==>" + no);
		System.out.println("===================");
	}

	public void bilgileriGoster() {
		System.out.println("===================");
		System.out.println("İsim= " + ad);
		System.out.println("Ogrenci No= " + no);
		System.out.println("===================");
	}

}
