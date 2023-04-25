package com.bilgeadam.lesson019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek2 {

	public static void main(String[] args) {

		String path = "E:/java-9-workspace/java9dosya/deneme5.txt";
		File file = new File(path);

		if (!file.exists()) {
			try {
				file.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			System.out.println("Dosya daha once olusturulmustur");
		}

		FileWriter fileWriter;
		BufferedWriter writer = null;
//		try {
//			fileWriter = new FileWriter(file);
//			writer = new BufferedWriter(fileWriter);
//
//			writer.write("Deneme");
//
//			System.out.println("yazma işlemi başarılı");
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				try {
//					Thread.sleep(3000);
//					writer.flush();
//					System.out.println("2.kademeye geçiş");
//					writer.write("  Yeni deger");
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				writer.close();
//				System.out.println("program sonlandı");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(file))) {
			writer2.write("Java\n");
			writer2.write("React");
			writer2.newLine();
			writer2.write("Html");

		} catch (Exception e) {
			// TODO: handle exception
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

//			System.out.println((char) reader.read());
//			System.out.println(reader.skip(1));
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());

			String deger;

			while ((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
