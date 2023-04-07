package com.bilgeadam.lesson011.databseornekabstract;

import java.util.Scanner;

/*
 * bir menumuz olacak 
 * 1-Veri ekle
 * 2-Veri sil
 * 3-Veri Guncelle
 * 4-Verileri getir
 * 
 * daha sonra bir çalıstır metodumuz olacak olacak 
 * bu metotta menuden secim yapıcagız bu secime gore 
 * database den bir metot calısacak 
 * 
 * 
 * 
 */
public class Manager {

	Database database;

	public Manager(Database database) {
		this.database = database;
	}

	public void menu() {
		System.out.println("1-Veri ekle");
		System.out.println("2-Veri sil");
		System.out.println("3-Veri guncelle");
		System.out.println("4-Verileri getir");
		System.out.println("0-Çıkış");
	}

	public void calistir() {
		Scanner scanner = new Scanner(System.in);

		int secim;
		database.login();
		do {

			menu();
			System.out.println("Lütfen bir secim yapınız");
			secim = Integer.parseInt(scanner.nextLine());

			switch (secim) {
			case 1:
				database.ekle();
				break;
			case 2:
				database.sil();
				break;
			case 3:
				database.guncelle();
				break;
			case 4:
				database.verileriGetir();
				break;
			case 0:
				System.out.println("Sistemden çıkılıyor....");
				break;
			default:
				break;
			}

		} while (secim != 0);

	}
}
