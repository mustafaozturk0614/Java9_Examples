package com.bilgeadam.lesson011.taskagıtmakas;

import java.util.Random;
import java.util.Scanner;

public class Uygulama2 {

	public void oyun() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		ESecenek2[] secenekler = ESecenek2.values();

		System.out.println("TAŞ KAĞIT MAKAS OYUNUNA HOŞ GELDİNİZ");
		for (ESecenek2 eSecenek : secenekler) {
			System.out.println((eSecenek.ordinal() + 1) + "-" + eSecenek);
		}
		ESecenek2 secim = secenekler[scanner.nextInt() - 1];
		ESecenek2 pcSecim = secenekler[random.nextInt(secenekler.length)];

		if (pcSecim == secim) {
			System.out.println("Beraberlik");
		} else if (pcSecim.kaybeder.equalsIgnoreCase(secim.name())) {
			System.out.println("Kazandınız");
		} else {
			System.out.println("Kaybettiniz");
		}

		System.out.println("Pc secim===>" + pcSecim);
	}

}
