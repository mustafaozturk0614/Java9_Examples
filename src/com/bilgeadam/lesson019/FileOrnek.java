package com.bilgeadam.lesson019;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	// output --> yazma
	// input --> okuma işlemleri

	public static void main(String[] args) {

		File file = new File("E:/java-9-workspace/java9dosya/deneme3.txt");
		File file2 = new File("E:/java-9-workspace/java9dosya/deneme4.txt");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream("E:/java-9-workspace/java9dosya/deneme2.txt", false); // true
																								// degeri
																								// programı
																								// herçalıştırdıgımızda
																								// dosyayı
																								// sıfırlamamızı
																								// engeller
			FileOutputStream fos2 = new FileOutputStream(file); // dosya yoksa olusturur ve otputstreame o dosyayı
			// yazmak için tanımlamış oluruz
			file2.createNewFile();// sadece dosya olusturur
			// fos.write(65);
			// fos.write(80);
			// byte[] array = { 101, 80, 88 };
			// fos.write(array);

			String kelime = "Merhaba Dunya";
			fos.write(kelime.getBytes());
//			String kelime2 = " Java";
//			fos.write(kelime2.getBytes());

			// okuma işlemleri

			fis = new FileInputStream("E:/java-9-workspace/java9dosya/deneme2.txt");
//			int deger1 = fis.read();
//			System.out.println((char) deger1);
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());

			int deger;

			while ((deger = fis.read()) != -1) {
				System.out.print((char) deger);
			}
			// System.out.println(file2.length());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
