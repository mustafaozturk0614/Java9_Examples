package com.bilgeadam.lesson020;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8722940964154178535L;

	private String title;
	private String genre;
	private LocalDate date;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String genre, LocalDate date) {
		super();
		this.title = title;
		this.genre = genre;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public String getgenre() {
		return genre;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", date=" + date + "]";
	}

}
