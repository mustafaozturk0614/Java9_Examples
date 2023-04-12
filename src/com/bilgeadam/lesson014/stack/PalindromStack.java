package com.bilgeadam.lesson014.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * dışarıdan bir kelime alıp bu kelimeyi once stack e aktaralım
 * daha sonra bu stack uzerinde calısıp bu kelimenin palindrom olup olmadıgını bulalım
 * kek, kabak,tat,==> tersten okusunu ve duzden okunusu aynı olan kelimeler palindromdur
 *   
 * 
 * 
 * 
 */
public class PalindromStack {

	Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {

		PalindromStack palindromStack = new PalindromStack();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();
		if (palindromStack.isPalindrom(kelime)) {
			System.out.println(kelime + " Palindromdur");
		} else {
			System.out.println(kelime + " Palindrom değildir");
		}

	}

	public void stackOlustur(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}

	}

	public boolean isPalindrom(String kelime) {

		stackOlustur(kelime);

		for (int i = 0; i < kelime.length() / 2; i++) {
			if (stack.pop() != kelime.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
