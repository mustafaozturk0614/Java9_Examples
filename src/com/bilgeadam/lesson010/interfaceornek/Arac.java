package com.bilgeadam.lesson010.interfaceornek;

/*abstract sınıflarda ne zaman  abstract metot yazarız;
 * metot altsınıflarda değişime ugruyorsa abstract metot yazarız
 * ugramıyorsa govdeli metot yazarız
 * 
 * ucaklarda hiz 50 50 artsın ve yavaslasın 
 * gemilerde hiz 10 10  artsın ve yavaslasın
 * otomobillerde hiz 20 20 artsın ve yavaslasın
 * kamyonlarda hiz 5 5 artsın ve yavaslasın
 * 

 * 
 */
public abstract class Arac {

	int hiz;

	public abstract void hizlan();

	public abstract void yavasla();

	public void hizGoster() {
		System.out.println("hızınız===>" + hiz);
	}

}
