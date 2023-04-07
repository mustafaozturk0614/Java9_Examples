package com.bilgeadam.lesson011.enums;

public class EnumTest {

	public static void main(String[] args) {

		System.out.println(EAylar.AGUSTOS.name());

		String agustos = EAylar.AGUSTOS.toString();
		System.out.println(agustos);
		System.out.println(EAylar.AGUSTOS.ordinal());
		System.out.println(EAylar.HAZIRAN.ordinal());
		EAylar ay = EAylar.valueOf("TEMMUZ");
		System.out.println(ay.ordinal());
		System.out.println(ay.name());
		// EAylar ay2 = EAylar.valueOf("TEMMUZZ");

		EAylar[] aylar = EAylar.values();
		System.out.println("===============");
		for (EAylar value : aylar) {

			System.out.println((value.ordinal() + 1) + "- " + value);

		}

		System.out.println(EAylar.HAZIRAN.getGunSayisi());
		System.out.println(EAylar.HAZIRAN.getIsim());

	}

}
