package com.bilgeadam.lesson002;


import java.util.Scanner;

/*
 * Dışarıdan bir kelime alacağız daha sonra her harfi 
 * başına index numarası gelecek şekilde alt lata yazdıralım 
 *  0-+a
	1-b
 * 
 */
public class Question1 {

	
	public static void main(String[] args) {
	
			Scanner scanner=new Scanner(System.in);
			System.out.println("Lütfen bir kelime giriniz");
			String kelime=scanner.nextLine();
			
			for (int i = 0; i < kelime.length(); i++) {
				System.out.println(i+"-"+kelime.charAt(i));
			//	System.out.print(i+"-"+kelime.charAt(i)+"...");
				
			}
			
			scanner.close();
		
	}

}
