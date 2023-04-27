package com.bilgeadam.lesson021.okulapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {

	static File file = new File("E:/java-9-workspace/java9dosya/ogrenci.txt");

	public static void dosyadanVeriOku() {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		String o1 = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			while ((o1 = reader.readLine()) != null) {
				System.out.println(o1);
				String[] array = o1.split(",");
				String isim = array[0];
				List<String> list = Arrays.asList(array).subList(1, 4);
				Double ort = ortHeseapla(list);
				LocalDate date = Utility.stringToLocalDateDayMonthYear(array[array.length - 1]);
				Ogrenci ogrenci = new Ogrenci(isim, ort, date);
				ogrenciler.add(ogrenci);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ogrenciler.forEach(System.out::println);
	}

	private static Double ortHeseapla(List<String> list) {

		// list.stream().map(x ->
		// Double.parseDouble(x)).collect(Collectors.averagingDouble(y -> y));

		return list.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

	public static void main(String[] args) {
		dosyadanVeriOku();
	}

}
