package com.bilgeadam.lesson017.sanslinumaralar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {

	Map<Integer, Integer> map;
	List<Integer> list;
	Set<Integer> set;

	public SansliNumaralar() {
		this.map = new HashMap<>();
		this.list = new ArrayList<>();
		this.set = new TreeSet();
	}

	public void mapOlustur() {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int sayi = random.nextInt(1, 101);
			if (map.containsKey(sayi)) {
				map.put(sayi, map.get(sayi) + 1);
			} else {
				map.put(sayi, 1);
			}

		}

	}

	public void listeOlustur() {

		for (Entry<Integer, Integer> sayi : map.entrySet()) {
			int count = sayi.getValue();
			for (int i = 0; i < count; i++) {
				list.add(sayi.getKey());
			}
		}

	}

	public void setOlustur() {
		Random random = new Random();
		Collections.shuffle(list);
		while (set.size() < 10) {
			int index = random.nextInt(list.size());
			set.add(list.get(index));
		}
	}

}
