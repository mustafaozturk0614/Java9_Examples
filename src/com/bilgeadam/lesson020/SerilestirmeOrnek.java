package com.bilgeadam.lesson020;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerilestirmeOrnek {
	static File file = new File("E:/java-9-workspace/java9dosya/seri.txt");

	public static void main(String[] args) {

		Movie movie = new Movie("Ruhların Kaçışı", "Anime", LocalDate.of(2001, 10, 15));
		Movie movie2 = new Movie("Seven", "Drama", LocalDate.of(1995, 05, 05));
		List<Movie> movieList = new ArrayList<>(List.of(movie, movie2));

		// serilestir(movie, movie2);
		serilestir(movieList);

		deserilizeList();

	}

	private static Movie deserilize() {
		Movie movie = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("E:/java-9-workspace/java9dosya/seri.txt"));
			try {
				movie = (Movie) ois.readObject();
				System.out.println(movie);
				// System.out.println(movie);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		} catch (EOFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return movie;
	}

	private static Movie deserilize2() {
		Movie movie = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("E:/java-9-workspace/java9dosya/seri.txt"));
			try {

				for (int i = 0; i < file.length(); i++) {
					movie = (Movie) ois.readObject();
					System.out.println(movie);
				}

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		} catch (EOFException e) {
			System.out.println("Dosya sonu");
			System.out.println(e.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return movie;
	}

	public static void serilestir(Movie movie, Movie movie2) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:/java-9-workspace/java9dosya/seri.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(movie);
			oos.writeObject(movie2);
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

	public static void serilestir(List<Movie> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:/java-9-workspace/java9dosya/seri.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

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

	public static void serilestir2(List<Movie> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:/java-9-workspace/java9dosya/seri.txt");
			oos = new ObjectOutputStream(fos);

			for (Movie movie : list) {
				oos.writeObject(movie);
			}

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

	private static List<Movie> deserilizeList() {
		List<Movie> movieList = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("E:/java-9-workspace/java9dosya/seri.txt"));
			try {

				movieList = (List<Movie>) ois.readObject();

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		movieList.forEach(System.out::println);

		return movieList;
	}

}
