package com.bilgeadam.lesson021.okulapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {

		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FileManager.file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Ogretmen ogretmen = new Ogretmen("Mustafa", bufferedReader);
		Ogretmen ogretmen2 = new Ogretmen("Barış", bufferedReader);
		ogretmen.start();
		ogretmen2.start();

		try {
			ogretmen.join();
			ogretmen2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ogretmen.ogrencileriKaydet();
		ogretmen2.ogrencileriKaydet();
		System.out.println(ogretmen.getIsim() + "-->" + ogretmen.getOgrenciler().size());
		System.out.println(ogretmen2.getIsim() + "-->" + ogretmen2.getOgrenciler().size());

//		ogretmen.dosyadanOku();
//		System.out.println(ogretmen.getOgrenciler().get(8));
//		ogretmen.notEkleVeKaydet(90);
//		System.out.println(ogretmen.getOgrenciler().get(8));

	}

}
