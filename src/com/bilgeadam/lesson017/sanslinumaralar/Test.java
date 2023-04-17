package com.bilgeadam.lesson017.sanslinumaralar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.map.entrySet().forEach(System.out::println);
		sansliNumaralar.listeOlustur();
		System.out.println(sansliNumaralar.list.size());
		// sansliNumaralar.list.forEach(System.out::println);
		sansliNumaralar.setOlustur();
		System.out.println("Sanslı Numaralar");
		sansliNumaralar.set.forEach(System.out::println);
		System.out.println("42 den buyuk sayılar");
		sansliNumaralar.set.stream().filter(x -> x > 42).forEach(System.out::println);
		Integer sum = sansliNumaralar.set.stream().mapToInt(Integer::intValue).sum();
		System.out.println("toplam==>" + sum);
		Integer sum2 = sansliNumaralar.set.stream().reduce(0, (a, b) -> a + b);
		System.out.println("toplam2==>" + sum2);
		Optional<Integer> sum3 = sansliNumaralar.set.stream().filter(x -> x > 42).reduce((a, b) -> a + b);
		System.out.println("toplam3==>" + sum3);
		Double ort = sansliNumaralar.set.stream().filter(x -> x > 42).mapToInt(Integer::intValue).average()
				.getAsDouble();

		System.out.println("ort==>" + ort);
		Double ort2 = sansliNumaralar.set.stream().filter(x -> x > 42)
				.collect(Collectors.averagingDouble(Integer::intValue));
		System.out.println("ort2==>" + ort2);
		Double ort3 = sansliNumaralar.set.stream().filter(x -> x > 42).collect(Collectors.averagingDouble(y -> y));
		System.out.println("ort3==>" + ort3);
		Optional<Integer> max = sansliNumaralar.set.stream().reduce(Integer::max);
		System.out.println("Max==>" + max);
		Integer max2 = sansliNumaralar.set.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("Max2==>" + max2);
		Optional<Integer> max3 = sansliNumaralar.set.stream().max(Comparator.naturalOrder());
		System.out.println("Max3==>" + max3);
		Optional<Integer> max4 = sansliNumaralar.set.stream().max(Integer::compareTo);
		System.out.println("Max4==>" + max4);
		Optional<Integer> min = sansliNumaralar.set.stream().min(Integer::compareTo);
		System.out.println("Min==>" + min);
		long size = sansliNumaralar.set.stream().filter(x -> x > 50).count();
		System.out.println("count==>" + size);
		List<String> numbers = sansliNumaralar.set.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(numbers);
		String value = numbers.stream().collect(Collectors.joining(","));
		System.out.println(value);
		Collections.shuffle(sansliNumaralar.list);
		List<Integer> list = sansliNumaralar.list.stream().skip(250).limit(20).collect(Collectors.toList());
		System.out.println(list);
		Boolean kontrol = list.stream().anyMatch(x -> x == 50);
		System.out.println(kontrol);
		Boolean kontrol2 = list.stream().allMatch(x -> x > 5);
		System.out.println(kontrol);
	}
}
