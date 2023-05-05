package com.bilgeadam.lesson025.singelton;

/*
 * Singelton yapısında bir Sınıf olusturmak için gerekli adımlar
 * 1- const---> private olacak
 * 2- sınıf içinde kendi referansında private static bir değişken tanımlayacağız
 * 3- static bir getInstance() metodumuz olacak içerde instace ozellğimizin null 
 * olup olmadıgını kontrol edecek eger null ise new leme işlemi yapıcak ve bize sonunda 
 * return olarak instance degiskenini donecek
 * 
 * 
 * 
 */
public class MyPostgreConnection {

	private static MyPostgreConnection instance;

	private MyPostgreConnection() {

	}

	public static MyPostgreConnection getINSTANCE() {
		if (instance == null) {
			instance = new MyPostgreConnection();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "hashCode()=" + hashCode();
	}

}
