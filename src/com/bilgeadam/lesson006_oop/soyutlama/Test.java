package com.bilgeadam.lesson006_oop.soyutlama;

public class Test {

	public static void main(String[] args) {
		// sınıfımızda herhangi bir consturctor yoksa default olarak bos const. gelir
		// fakat herhangi bir const. tanımı yaparsak default const. bosa dusecektir ve
		// parametresiz const.
		// çalışmaycaktır
		Post post = new Post(1, "ilk post");
		System.out.println(post.icerik);

		Post post2 = new Post();

		Post post3 = new Post(2, "ikinci post", 1);
		System.out.println(post3.icerik);

		Post post4 = new Post(3, "yeni post", 2, "resimurl");
		System.out.println(post4.icerik);

	}

}
