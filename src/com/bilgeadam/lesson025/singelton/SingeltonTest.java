package com.bilgeadam.lesson025.singelton;

public class SingeltonTest {

	public static void main(String[] args) {

		MyPostgreConnection myPostgreConnection1 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection2 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection3 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection4 = MyPostgreConnection.getINSTANCE();

		System.out.println(myPostgreConnection1);
		System.out.println(myPostgreConnection2);
		System.out.println(myPostgreConnection3);
		System.out.println(myPostgreConnection4);

	}

}
