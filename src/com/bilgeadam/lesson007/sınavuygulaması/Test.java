package com.bilgeadam.lesson007.sınavuygulaması;

/*
 * Sınav sınıfımız olacak bu sınıfı soyutluyacagız
 * ve Birde Sorularımız olacak 
 * bu sorularımız test turunde oldugu 
 * için çoktan secmeli cevapları olsun ve bu cevapların şıklarını tutalım 
 * 
 * 
 * 
 * 
 * 
 */
public class Test {

	public static void main(String[] args) {

		Sınav sınav = new Sınav();
		sınav.sinavOlustur();
		sınav.cevaplariGir();
		sınav.cevaplarıKontrolEt();

//		for (Soru soru : sınav.sorular) {
//
//			System.out.println(soru);
//
//		}

	}

}
