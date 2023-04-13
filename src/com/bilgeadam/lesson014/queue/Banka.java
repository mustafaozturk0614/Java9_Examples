package com.bilgeadam.lesson014.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {

//	Comparator<Musteri> comparator = new Comparator<Musteri>() {
//
//		@Override
//		public int compare(Musteri o1, Musteri o2) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};

	Queue<Musteri> musteriler = new PriorityQueue<>(new Comparator<Musteri>() {

		@Override
		public int compare(Musteri o1, Musteri o2) {
			if (o1.musterMi && o2.musterMi) {
				return o1.siraNo - o2.siraNo;
			} else if (o1.musterMi) {
				return -1;
			} else if (!o1.musterMi && !o2.musterMi) {
				return o1.siraNo - o2.siraNo;
			}
			return 1;
		}
	});

	public void kuyurugaMusteriEkle() {
		musteriler.offer(new Musteri("Mustafa", 5, false));
		musteriler.offer(new Musteri("Kemal", 1, true));
		musteriler.offer(new Musteri("Merve", 4, true));
		musteriler.offer(new Musteri("Ali", 2, false));
		musteriler.offer(new Musteri("Gizem", 3, true));
		musteriler.offer(new Musteri("Okan", 6, false));
		musteriler.offer(new Musteri("Zeliha", 7, true));
	}

	public void kuyruguYazdir() {
		while (!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}
	}

	public static void main(String[] args) {

		Banka banka = new Banka();
		banka.kuyurugaMusteriEkle();
		banka.kuyruguYazdir();

	}

}
