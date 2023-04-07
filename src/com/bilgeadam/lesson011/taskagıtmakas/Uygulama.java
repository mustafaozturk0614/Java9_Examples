package com.bilgeadam.lesson011.taskagıtmakas;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {

	ESecenek[] secenekler = ESecenek.values();

	public void oyun() {
		ESecenek secimim = benimSecimim();
		ESecenek pc = pcSecim();

		if (pc == secimim) {
			System.out.println("Beraberlik");
		} else {
			switch (secimim) {
			case TAS:
				if (pc == ESecenek.KAGIT) {
					System.out.println("Kaybettiniz");
				} else {
					System.out.println("Kazandınız");
				}

				break;
			case KAGIT:
				if (pc == ESecenek.MAKAS) {
					System.out.println("Kaybettiniz");
				} else {
					System.out.println("Kazandınız");
				}

				break;

			case MAKAS:
				if (pc == ESecenek.TAS) {
					System.out.println("Kaybettiniz");
				} else {
					System.out.println("Kazandınız");
				}

				break;
			default:
				break;
			}
		}
		System.out.println("Pc secimi===> " + pc);

	}

	public ESecenek benimSecimim() {
		Scanner scanner = new Scanner(System.in);
		for (ESecenek eSecenek : secenekler) {
			System.out.println((eSecenek.ordinal() + 1) + "-" + eSecenek);
		}
		System.out.println("Lütfen TAS/KAGIT/MAKAS Verilerinden birini seciniz");
		int secim = Integer.parseInt(scanner.nextLine());
		return secenekler[secim - 1];

	}

	public ESecenek pcSecim() {
		Random random = new Random();
		int index = random.nextInt(secenekler.length);
		return secenekler[index];
	}

}
