package com.bilgeadam.lesson014.stack;

import java.util.Stack;

/*
 * integer bir stack olusturup içcerisine 5 6 tane değer ekleyelim 
 * 
 * 100 den buyuk olanları toplam değerine ekleyelim 100den kucuk olanlarıda başka bir stack yapısında
 * tutalım en sonundada toplamı ve diğer stack i yazdıralım 
 * 
 * 
 */
public class ParaSayma {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> yuzdenKucukler = new Stack<>();
		int toplam = 0;
		stack.push(120);
		stack.push(320);
		int a = stack.push(20);
		System.out.println(a);
		if (stack.add(2)) {

			System.out.println("veri eklendi");
		}
		stack.push(50);
		stack.push(5);
		stack.push(52);
		stack.push(350);

		// peek en usteki değere bakmamızı sağlar yani onun değerini bize gosteriri
		// pop en usteki değeri stackden çıkartır

		while (!stack.isEmpty()) {

			int para = stack.peek();
			System.out.println(para + " bakıldı");
			if (para > 100) {
				toplam += stack.pop();
			} else {
				yuzdenKucukler.push(stack.pop());
			}

		}

//		for (int i = 0; i < stack.size(); i++) {
//			System.out.println(stack.get(i));
//
//		}

		System.out.println("toplam= " + toplam);

		yuzdenKucukler.forEach(System.out::println);
		System.out.println("==============================");
		yuzdenKucukler.forEach((x) -> System.out.println(x));

	}

}
