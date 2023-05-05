package com.bilgeadam.lesson024.dependecyInversion;

import com.bilgeadam.lesson024.dependecyInversion.databselogger.DatabaseLogger;
import com.bilgeadam.lesson024.dependecyInversion.exception.StoryException;
import com.bilgeadam.lesson024.dependecyInversion.exception.VideoException;

public class Test {

	public static void main(String[] args) {

		WhatsApp whatsApp = new WhatsApp();
		DatabaseLogger databaseLogger = new DatabaseLogger();

		try {
			whatsApp.videoConferencing();

		} catch (VideoException e) {
			/// Database logger uzerinden mongoya log yapmak istiyorum
			databaseLogger.logToMongo(e.getMessage());

		}

		try {
			whatsApp.shareStory();
		} catch (StoryException e) {
			/// Database logger uzerinden postgre log yapmak istiyorum
			databaseLogger.logToPostgre(e.getMessage());
		}

	}

}
