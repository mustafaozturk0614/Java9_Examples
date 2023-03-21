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
public class Question4 {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Lütfen bir iban giriniz");
			String iban=scanner.nextLine().toUpperCase();
			
			String kontrol=iban.substring(0,3); //TR OTH
			
			switch (kontrol.trim()) {
			case "TR":
				System.out.println("Yurt içi işlemler");
				String bankaNo=iban.substring(iban.length()-4);// 5002 veya 5001 gibi son 4 değer
				switch (bankaNo) {
				case "5001":
					System.out.println("Ziraat BAnkası");
					break;
				case "5002":
					System.out.println("Garnti BAnkası");
					break;
				case "5003":
					System.out.println("İş BAnkası");
					break;					
				default:
					System.out.println("Diğer");
					break;
				}
					
				break;
			case "OTH":
				System.out.println("Yurt dışı işlemer");
				String bankaNo2=iban.substring(iban.length()-4);
				switch (bankaNo2) {
				case "2000":
					System.out.println("Kıta içi işlemler işlemer");
					System.out.println(iban.replace("OTH", "Kİ"));
					break;

				default:
					System.out.println("Kıta dışı işlemler işlemer");
					System.out.println(iban.replace("OTH", "KD"));
					break;
				}
				
				break;
			default:
				System.out.println("Yanlış iban girdiniz");
				break;
			}
			
	}

}
