package com.bilgeadam.lesson024.openclosed;

public class Twitter extends SocialMedia {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(39);
		} else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(35);
		} else {
			setScaleRatio(46);
		}

	}

}
