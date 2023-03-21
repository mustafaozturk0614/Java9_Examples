package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * dışarıdan kullanıcıdan bir ülke ismi alıp bu dizide olup olmadıgını kontrol edelim
 * yoksa girdiğiniz ülke bulunamadı diye bir çıktı verelim 
 * varsa girdiğiniz ülke bulundu çıktısı verelim 
 * 
 * 
 */
public class Question5 {

	public static void main(String[] args) {
		
		String [] dizi= {"Türkiye","Japonya","Moğolistan","Fransa","Danimarka","Norveç"};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir ülke ismi giriniz");
		String ulke=scanner.nextLine();
		String temp="";
		
		
		System.out.println("======1.çözüm=====");
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiğiniz ülke bulundu");
				break;
			}else {
				if (i==dizi.length-1) {
					System.out.println("Girdiğiniz ülke bulunamadı!!!!!!");
				}
			}
			
		}
		System.out.println("/////////////////////////////////////////////");
		System.out.println("======2.çözüm=====");
		int count=0;
		
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiğiniz ülke bulundu");
				count++;
				break;
			}
			
		}
		
		
		if (count==0) {
			System.out.println("Ülke Bulunamadı");
		}
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("======3.çözüm=====");
		boolean kontrol=false;

		for (int i = 0; i < dizi.length; i++) {
				
			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiğiniz ülke bulundu");
					kontrol=true;
				break;
			}
		}
		
		if (kontrol==false) {
			System.out.println("Ülke Bulunamadı");
		}
		
		System.out.println("/////////////////////////////////////////////");
		System.out.println("======4.çözüm=====");
		String kontrol2="Girdiğiniz Ülke Bulunamadı!!!!";
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				kontrol2="Girdiğiniz Ülke Bulundu";
				break;
			}
		}
		System.out.println(kontrol2);
		
	}
	
	
}
