package com.bilgeadam.lesson024.interfacesegregation;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void videoConferencing() {
		// TODO Auto-generated method stub

	}

}
