package com.bilgeadam.lesson004;

public class MetotTest {

	public static void main(String[] args) {
		metot1();
		metot2("Java", 12, 5);
		int sayi1 = 10;
		int sayi2 = 15;
		String deger = "React";
		metot2(deger, sayi1, sayi2);
//		System.out.println(metot1()); // void metotlar sout içinde kullanılamazlar

		// metot3();
		System.out.println(metot3());
		int toplam = metot3();
		System.out.println("toplam: " + toplam);
		System.out.println(metot3(10, 5));

	}

	// donusu olmayan parametresiz metot tipi -- bize bir değer dondurmez
	// sadece metot içinde geçen işlemleri yapar

	public static void metot1() {
		System.out.println("Merhaba Dünya");
		int sayi1 = 5;
		int sayi2 = 6;
		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
	}

	// donusu olmayan parametreli metot ---bize bir değer dondurmez
	// sadece metot içinde geçen işlemleri yapar fakat dışarıdan bir parametre alır
	public static void metot2(String value, int number1, int number2) {
		System.out.println(value);
		int toplam = number1 + number2;
		System.out.println(toplam);
	}

	// donusu olan parametresiz metot-- metot içindeki işlemler sonucunda
	// bize bir değer doner bu değer metodun donus tipiyle aynı olmalıdır!!!

	public static int metot3() {
		int sayi1 = 5;
		int sayi2 = 6;
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	// metot overloading aynı isimli metotları farklı parametrelerle tanımlayarak
	// kullanabilirz
	public static int metot3(int number1, int number2) {
		return number1 + number2;
	}
}
