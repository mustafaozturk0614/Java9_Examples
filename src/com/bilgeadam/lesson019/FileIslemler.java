package com.bilgeadam.lesson019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * FileSabitler sınıfı olusturalım
 * bu sınıfta filemızın degerlerini tutalım  
 * 
 * menumuzde ki işlemlerin her biri için bir metot yazıp bunları uygulma esnasında 
 * kullanacagız
 * 
 * 1- dosya yarat metodu ==>  eger dosya daha once yaratılmamıssa
 * dosyaismi basarı ile olusturulmustur
 * eğer daha once olusturulmus ise  dosyaismi daha once olusturulmustur cıktısı versin 
 * 2-dosya sil dosya daha onceden varsa dosyayı silecek yoksa boyle bir dosya bulunamadı 
 * diye bir hata verecek
 * 
 * 3- dısarıdan alınan degeri dosyaya ekleyelim
 * 
 * 4-Dosyadan okudunuz veriyi bir string degerde tutalım dosyadaki hali ile
 * daha sonra bu strin degeri yazdıralım
 * 
 * 5- bir harf belirleyecğiz eger bu harf 
 * dosyada var ise bunu ikinci belilediğimiz harf ile değiştireceğiz
 * 
 */
public class FileIslemler {

	public void menu() {
		System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3-Dosya ya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değiştir");
	}

	public int secimYap() {
		Scanner scanner = new Scanner(System.in);
		String secim = scanner.nextLine();
		return Integer.parseInt(secim);

	}

	public void uygulama() {
		int secim = 0;
		do {
			menu();
			System.out.println("Lütfen bir secim yapınız");
			secim = secimYap();
			switch (secim) {
			case 1:
				dosyaYarat2();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				// dosyaSil2();
				veriYaz();
				break;
			case 4:

				dosyadanVeriOkuma();
				break;
			case 5:
				harfDegistir();
				break;
			default:
				break;
			}

		} while (secim != 0);

	}

	public void dosyaYarat() {
		try {
			if (!FileSabitler.FILE.exists()) {
				FileSabitler.FILE.createNewFile();
				System.out.println(FileSabitler.FILE.getName() + " başarıyla olusturulmustur");
			} else {
				System.out.println(FileSabitler.FILE.getAbsolutePath() + " daha once olusturulmustur");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void dosyaYarat2() {

		try {
			if (FileSabitler.FILE.createNewFile()) {
				System.out.println(FileSabitler.FILE.getName() + " başarıyla olusturulmustur");
			} else {
				System.out.println(FileSabitler.FILE.getAbsolutePath() + " daha once olusturulmustur");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dosyaSil() {
		if (FileSabitler.FILE.delete()) {
			try {
				System.out.println("Dosya silme işlemi başlamıştır");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(FileSabitler.FILE.getAbsolutePath() + " başarı ile silinmiştir");
		} else {
			System.out.println("Dosya mevcut değildir!!!");
		}

	}

	public void dosyaSil2() {

		try {
			if (Files.deleteIfExists(Path.of("E:/java-9-workspace/java9dosya/deneme4.txt"))) {
				System.out.println("silme işlemi başarılı");
			} else {
				System.out.println("silme işlemi başarısızz");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void veriYaz() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Lütfen veri giriniz");
		String veri = scanner2.nextLine();
		boolean kontrol = false;
		System.out.println("Veri dosyanın devamınamı yazılsın (E/H)");
		String deger = scanner2.nextLine();
		if (deger.equalsIgnoreCase("E")) {
			kontrol = true;
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FileSabitler.FILE, kontrol))) {

			writer.write(veri + "\n");
			System.out.println("Veri başarılı bir şekilde dosayaya yazılmışdır");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String dosyadanVeriOkuma() {
		String metin = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FileSabitler.FILE))) {
			String satır = "";

			while ((satır = reader.readLine()) != null) {
				if (metin.equals("")) {
					metin += satır;
				} else {
					metin += "\n" + satır;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("metin==>" + metin);
		return metin;
	}

	public void harfDegistir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen eski harfi giriniz");
		String eskiHarf = scanner.nextLine();
		System.out.println("Lütfen yeni harfi giriniz");
		String yeniHarf = scanner.nextLine();
		String metin = dosyadanVeriOkuma();
		metin = metin.replace(eskiHarf, yeniHarf);

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FileSabitler.FILE))) {
			System.out.println("Yazma işlemi gerçekleştirliyor");
			Thread.sleep(2000);
			writer.write(metin);
			System.out.println("Yazma işlemi tamamlandı");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}