package com.bilgeadam.lesson024.dependecyInversion.databselogger.cozum;

import com.bilgeadam.lesson024.dependecyInversion.WhatsApp;
import com.bilgeadam.lesson024.dependecyInversion.exception.StoryException;
import com.bilgeadam.lesson024.dependecyInversion.exception.VideoException;

public class TestCozum {

	public static void main(String[] args) {

		WhatsApp whatsApp = new WhatsApp();

		try {
			whatsApp.videoConferencing();

		} catch (VideoException e) {
			/// Database logger uzerinden mongoya log yapmak istiyorum
			new DatabaseLogger(new MongoDb()).log(e.getMessage());

		}

		try {
			whatsApp.shareStory();
		} catch (StoryException e) {
			/// Database logger uzerinden postgre log yapmak istiyorum
			new DatabaseLogger(new MySql()).log(e.getMessage());
		}

	}
}
