package com.bilgeadam.lesson005;

public class StaticOrnek {

	public int number1;// nesne değişkeni -nesne özelliği

	public static int number2 = 20;// sınıf değişkeni -sınıf özelliği com.bilgeadam.lesson005.StaticOrnek.number2

	public void numaraVer() {

		System.out.println("Numara ver metodu");
		number1 += 1;
		number2 += 1;
		System.out.println("number1====>" + number1);
		System.out.println("number2====>" + number2);

	}

	public static void numaraVer2() { // static bir metot içinde static olmayan bir ozelliği direk kullanamayız
		System.out.println("===numaraver2 metodu===="); // kullanmamız için nesne uretmemeiz gerekli
		// System.out.println(number1);
		System.out.println(number2);
	}

	public static void main(String[] args) {

		StaticOrnek myStaticOrnek = new StaticOrnek();
		System.out.println(myStaticOrnek.number1);
		myStaticOrnek.number1 = 12;
		System.out.println(myStaticOrnek.number1);
		System.out.println(myStaticOrnek);

		myStaticOrnek = new StaticOrnek();
		System.out.println(myStaticOrnek.number1);
		System.out.println(myStaticOrnek);

		System.out.println(StaticOrnek.number2);
		System.out.println(number2);

	}
}
