package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH 2002002000 yerine 
 * Ki 200200…   eğer 2000 ile bitmiyorsa  Kd 200201…
 * 
 * 
 * 
 * 
 * 
 */
public class Question3 {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Lütfen bir iban giriniz");
			String iban=scanner.nextLine().toUpperCase();

			if (iban.startsWith("Tr".toUpperCase())) { //iban.substring(0,2).equals("Tr")
				System.out.println("Yurt içi işlemler");
				if (iban.endsWith("5001")) {
					System.out.println("Ziraat Bankası");
				}
				else if(iban.endsWith("5002")) {
					
					System.out.println("Garanti Bankası");
				}else if(iban.endsWith("5003")) {
					System.out.println("İş bankası");
				}else {
					System.out.println("Diğer");
				}
				
			}else if(iban.startsWith("Oth".toUpperCase())) {
				System.out.println("Yurt dışı işlemler");
				
				if (iban.endsWith("2000")) {
					System.out.println("Kıta içi işlemler");
					System.out.println(iban.replace("OTH", "Kİ"));
				}else {
					System.out.println("Kıta dışı işlemler");
					System.out.println(iban.replace("OTH", "KD"));
				}
				
			}else {
				System.out.println("Yanlış iban girdiniz");
			}
	}

}
