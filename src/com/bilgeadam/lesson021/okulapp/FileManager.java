package com.bilgeadam.lesson021.okulapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {

	static File file = new File("E:/java-9-workspace/java9dosya/ogrenci.txt");
	static String path = "E:/java-9-workspace/java9dosya/";

	public static List<Ogrenci> dosyadanVeriOku(BufferedReader reader, String ogretmenIsmi) {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		String o1 = "";

		try {
			while ((o1 = reader.readLine()) != null) {

				String[] array = o1.split(",");
				String isim = array[0];
				List<String> list = Arrays.asList(array).subList(1, 4);
				Double ort = ortHeseapla(list);
				LocalDate date = Utility.stringToLocalDateDayMonthYear(array[array.length - 1]);
				Ogrenci ogrenci = new Ogrenci(isim, ort, date);
				ogrenciler.add(ogrenci);
				System.out.println(
						ogretmenIsmi + " adlı ogretmen ===> " + ogrenci.getIsim() + " adlı ogrenci notu okundu");
				Thread.sleep(1000);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ogrenciler;
	}

	private static Double ortHeseapla(List<String> list) {

		// list.stream().map(x ->
		// Double.parseDouble(x)).collect(Collectors.averagingDouble(y -> y));

		return list.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

	public static void ogretmenDosyasiOlustur(List<Ogrenci> ogrenciler, String isim) {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(path + isim + ".txt"))) {

			writer.writeObject(ogrenciler);

		} catch (Exception e) {

		}
	}

	public static List<Ogrenci> ogrencileriGetir(String isim) {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		try (ObjectInputStream inpuInputStream = new ObjectInputStream(new FileInputStream(path + isim + ".txt"))) {

			ogrenciler = (List<Ogrenci>) inpuInputStream.readObject();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return ogrenciler;
	}

}
