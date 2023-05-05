package com.bilgeadam.lesson024.dependecyInversion;

import com.bilgeadam.lesson024.dependecyInversion.exception.StoryException;
import com.bilgeadam.lesson024.dependecyInversion.exception.VideoException;

public class WhatsApp extends SocialMedia implements IConferencable, IShareableStory, IChatable {

	@Override
	public void changeScaleRatio(String type) {

		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(28);
		} else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(32);
		} else {
			setScaleRatio(36);
		}
	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shareStory() {
		throw new StoryException("Hikaye hatası");

	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void videoConferencing() {
		throw new VideoException("Video hatası");

	}

}
