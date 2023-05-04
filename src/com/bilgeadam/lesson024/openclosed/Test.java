package com.bilgeadam.lesson024.openclosed;

public class Test {

	public static void main(String[] args) {
		SocialMedia instagram = new Instagram();
		ResizePhoto resizePhoto = new ResizePhoto();
		SocialMedia facebook = new Facebook();
		SocialMedia whatsApp = new WhatsApp();

		SocialMedia twitter = new Twitter();

//		resizePhoto.resizePhoto(instagram, "jpg");
//		resizePhoto.resizePhoto2(facebook, "png");
//		resizePhoto.resizePhoto2(instagram, "png");

//		
		resizePhoto.resize(whatsApp, "jpg");
		resizePhoto.resize(facebook, "jpg");
		resizePhoto.resize(instagram, "jpg");
		resizePhoto.resize(twitter, "jpg");

		System.out.println(facebook.getScaleRatio());
		System.out.println(instagram.getScaleRatio());
		System.out.println(whatsApp.getScaleRatio());
		System.out.println(twitter.getScaleRatio());

	}

}
