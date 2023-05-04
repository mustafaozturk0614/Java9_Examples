package com.bilgeadam.lesson024.openclosed;

public class WhatsApp extends SocialMedia {

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

}
