package com.bilgeadam.lesson023;

/*
 * 
 * bir tane stock değeri tanımlıyacağız ve başlangıc değeri 1000
 * daha sonra ürün sat diye bir metot olsun bu metot çalıştıgında 
 * benım stoğumdan birer birer urun azalsın  
 * 
 * Test sınıfındada iki tane lambda thread tanımlayıp 
 * ürün sat metodunu  500 defe gerçekleştirelim 
 * 
 * bu iki threadi çalıştıralım ve en sonundada mainde de count değerini yazdıralım 
 * 
 * 
 */
public class Product {

	public static int stockValue = 1000;

	public synchronized static void urunSat() {
		stockValue--;
	}

}
