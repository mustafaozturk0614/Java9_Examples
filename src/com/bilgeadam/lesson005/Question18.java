package com.bilgeadam.lesson005;

/*
 * primitive veri türündeki değişkenlerin değerleri  stack bellekte
 * referans veri tipindeki değişkenlerin verileri heap bellkete tutulur
 * 
 * 
 */
public class Question18 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		Integer c = 10;
		Integer d = 15;

		System.out.println(c);
		System.out.println(d);
		c = d;
		d = 24;
		System.out.println(c);
		System.out.println(d);

		System.out.println(a);// 5
		System.out.println(b);// 3
		a = b;
		b = 8;
		System.out.println(a);// 8-3
		System.out.println(b);// 8-8

		String[] sehirler1 = { "Ankara", "İstanbul", "İzmir" };
		String[] sehirler2 = { "Bursa", "Konya", "Mersin" };
		System.out.println(sehirler1[0]);// ankara
		System.out.println(sehirler2[1]);// konya

		sehirler2 = sehirler1;
		System.out.println(sehirler2[0]);// Ankara
		sehirler1[0] = "Bolu";
		System.out.println(sehirler2[0]);// Bolu
		sehirler2[1] = "Edirne";
		System.out.println(sehirler1[1]);// Edirne
	}

}
