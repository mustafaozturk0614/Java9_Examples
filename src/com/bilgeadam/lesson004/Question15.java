package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * bir metot yazacagız bu metot dışarıdan 2 tane sayı alacak bunları bir arraye atasın  
 * daha sonra arrayin ilk 2 elamnının çarpımını donsun 
 * 
 * main metotoda bir sayi değerimiz olsun ve bunun bir başlangıc degeri olsun 
 * birde sonuc degeri tanımlayalım baslangıc değeri=0 olsun 
 * daha sonra sonuca metotdan gelen değer ile tanımladığımız sayı degerinin bölümünü sonuca eşitleyelim
 * ve sonucu yazdıralım
 * 
 */

public class Question15 {

	public static void main(String[] args) {

		double sayi = 30;
		double sonuc = 0;

//		sonuc = deneme() / sayi;
//		System.out.println(sonuc);
//
//		sonuc = deneme(50, 3) / sayi;
//		System.out.println(sonuc);

		int[] array = sayilariAta();
		int carpım = carpim(array);
		sonuc = carpım / sayi;
		System.out.println(sonuc);
		//////////////
		System.out.println(carpim(sayilariAta()) / sayi);

	}

	public static int deneme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayıyı giriniz");
		int number1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayıyı giriniz");
		int number2 = scanner.nextInt();
		int[] array = new int[2];
		array[0] = number1;
		array[1] = number2;
		return array[0] * array[1];

	}

	public static int sayiAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen  sayı giriniz");
		int number = scanner.nextInt();
		return number;
	}

	public static int[] sayilariAta() {
		int number1 = sayiAl();
		int number2 = sayiAl();
		int[] array = new int[2];
		array[0] = number1;
		array[1] = number2;
		return array;
	}

	public static int carpim(int[] array) {
		return array[0] * array[1];
	}

	public static int deneme(int number1, int number2) {

		int[] array = new int[2];
		array[0] = number1;
		array[1] = number2;
		return array[0] * array[1];

	}

}
