package com.bilgeadam.lesson020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerilestirmeOrnek {

	public static void main(String[] args) {

		Movie movie = new Movie("Ruhların Kaçışı", "Anime", LocalDate.of(2001, 10, 15));
		Movie movie2 = new Movie("Seven", "Drama", LocalDate.of(1995, 05, 05));

		serilestir(movie);
		serilestir(movie2);
		deserilize2();

	}

	private static Movie deserilize() {
		Movie movie = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("E:/java-9-workspace/java9dosya/seri.data"));
			try {
				movie = (Movie) ois.readObject();
				// System.out.println(movie);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return movie;
	}

	private static void deserilize2() {
		Movie movie = null;
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("E:/java-9-workspace/java9dosya/seri.data"))) {

			try {

				while ((movie = (Movie) ois.readObject()) != null) {
					System.out.println(movie);
				}

				// System.out.println(movie);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void serilestir(Movie movie) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:/java-9-workspace/java9dosya/seri.data", true);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(movie);
			System.out.println(movie + " serileştirildi");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
