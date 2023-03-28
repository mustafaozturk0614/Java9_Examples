package com.bilgeadam.lesson005;

public class StaticTest {

//	StaticOrnek ornek = new StaticOrnek();

	public static void main(String[] args) {

//		StaticTest staticTest = new StaticTest();
//		System.out.println(staticTest.ornek.number1); // StaticOrnek.number2

		StaticOrnek myStaticOrnek = new StaticOrnek(); // nesne uretilen kod
		System.out.println(myStaticOrnek.number1);
		myStaticOrnek.number1 = 12;
		System.out.println(myStaticOrnek.number1);
		myStaticOrnek.numaraVer();

		System.out.println(StaticOrnek.number2);// number2 static

		StaticOrnek.numaraVer2();

	}

}
