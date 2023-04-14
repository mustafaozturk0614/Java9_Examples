package com.bilgeadam.lesson016.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		List<String> aylar = new ArrayList<>(List.of("Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz",
				"Agustos", "Eylul", "Ekim", "Kasım", "Aralık"));

		List<Integer> sayilar = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
		// foreach

		aylar.stream().forEach(x -> System.out.println(x.toLowerCase()));
		aylar.stream().forEach(x -> {
			x = x.substring(0, 3);
			x = "-" + x;
			System.out.println(x);

		});
		aylar.forEach(System.out::println);

		// map
		System.out.println("/////////////////////");
		aylar.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
		aylar.stream().map(x -> {
			x = x.substring(0, 3);
			x = "-" + x;
			return x;

		}).forEach(System.out::println);

		Set<String> liste = aylar.stream().map(x -> {
			x = x.substring(0, 3);
			x = "-" + x;
			return x;

		}).collect(Collectors.toSet());
		System.out.println("====set====");
		liste.forEach(System.out::println);

		List<String> liste3 = sayilar.stream().map(x -> "-" + x).collect(Collectors.toList());

		liste3.forEach(System.out::println);

		// filter

		aylar.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);

		List<String> liste4 = aylar.stream().filter(x -> x.startsWith("M")).collect(Collectors.toList());
		liste4.forEach(System.out::println);

		List<String> liste5 = aylar.stream().filter(x -> {
			if (x.startsWith("M")) {
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());
		List<Integer> liste6 = sayilar.stream().filter(x -> x > 5).collect(Collectors.toList());
		liste6.forEach(System.out::println);
		List<String> liste7 = sayilar.stream().filter(x -> x > 5).map(y -> "-" + y).collect(Collectors.toList());
		List<String> liste8 = sayilar.stream().filter(x -> x > 5).map(y -> {
			String x = y + "-";
			return x;
		}).collect(Collectors.toList());

		liste7.forEach(System.out::println);

		Map<String, Integer> map = aylar.stream().collect(Collectors.toMap(k -> k, v -> v.length()));

		Map<Integer, List<String>> map2 = aylar.stream().collect(Collectors.groupingBy(String::length));

		map2.entrySet().stream().forEach(System.out::println);

//		-6 
//		-7
//		-8

	}

}
