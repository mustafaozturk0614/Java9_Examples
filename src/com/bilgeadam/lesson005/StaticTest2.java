package com.bilgeadam.lesson005;

public class StaticTest2 {

	public static void main(String[] args) {

		StaticOrnek so = new StaticOrnek();

		int myDefault = StaticOrnek.number2;

		so.numaraVer();
		so.number1 = 5;
		so.numaraVer(); // number1=6,number2=22
		so = new StaticOrnek();
		StaticOrnek myOrnek = new StaticOrnek();
		so.numaraVer();// number=1,number2=23
		so.numaraVer();// number1=2,number2=24
		so.numaraVer();// number1=3,number2=25
		myOrnek.numaraVer();// number1=1 number2=26;
	}

}
