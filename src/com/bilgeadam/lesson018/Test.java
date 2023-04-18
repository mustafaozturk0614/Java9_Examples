package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {

			try {
				degerYazdır(scanner.nextInt());
			} catch (EksiDegerException e) {
				System.out.println(e.getMessage());

			}

		}

	}

	public static void degerYazdır(Integer deger) throws EksiDegerException {

		if (deger < 0) {
			throw new EksiDegerException("Eksi değer girilemezz!!!!");
		}

		System.out.println(deger);
	}
}
