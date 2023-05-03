package com.bilgeadam.lesson022.taksiapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {

	private List<Taksi> taksiler;
	Queue<Integer> musteriler;

	public Durak() {
		taksiler = new ArrayList<>();
		musteriler = new LinkedList<>();
		musteriOlustur();
		taksiOlustur();
	}

	public void musteriOlustur() {
		for (int i = 1; i <= 5000; i++) {
			musteriler.add(i);
		}

	}

	public void taksiOlustur() {

		for (int i = 1; i <= 50; i++) {
			Taksi taksi = new Taksi(i);
			taksi.setDurak(this);
			taksiler.add(taksi);

		}
	}

	public List<Taksi> getTaksiler() {
		return taksiler;
	}

	public Queue<Integer> getMusteriler() {
		return musteriler;
	}

	public void setTaksiler(List<Taksi> taksiler) {
		this.taksiler = taksiler;
	}

	public void setMusteriler(Queue<Integer> musteriler) {
		this.musteriler = musteriler;
	}

	public synchronized int musteriAl() {
		
		return musteriler.poll();
	}

	public synchronized boolean isEmpty() {

		return musteriler.isEmpty();
	}

}
