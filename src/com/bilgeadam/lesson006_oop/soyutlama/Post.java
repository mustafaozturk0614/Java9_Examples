package com.bilgeadam.lesson006_oop.soyutlama;

public class Post {
	int id;
	String icerik;
	String resimUrl;
	int userId;

	public Post() {

	}

	public Post(int id, String icerik) {
		this.id = id;
		this.icerik = icerik;
	}

	public Post(int id, String icerik, int userId) {
		this.id = id;
		this.icerik = icerik;
		this.userId = userId;
	}

	public Post(int id, String icerik, int userId, String resimUrl) {
		this(id, icerik, userId);
		this.resimUrl = resimUrl;
	}

}
