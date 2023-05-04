package com.bilgeadam.lesson024.openclosed;

public class ResizePhoto {

	public void resizePhoto(Instagram instagram, String type) {
		if (type.equalsIgnoreCase("jpg")) {
			instagram.setScaleRatio(38);
		} else if (type.equalsIgnoreCase("png")) {
			instagram.setScaleRatio(30);
		} else {
			instagram.setScaleRatio(40);
		}
	}

	public void resizePhoto2(SocialMedia socialMedia, String type) {

		if (socialMedia instanceof Instagram) {
			if (type.equalsIgnoreCase("jpg")) {
				socialMedia.setScaleRatio(38);
			} else if (type.equalsIgnoreCase("png")) {
				socialMedia.setScaleRatio(30);
			} else {
				socialMedia.setScaleRatio(40);
			}
		} else if (socialMedia instanceof Facebook) {

			if (type.equalsIgnoreCase("jpg")) {
				socialMedia.setScaleRatio(34);
			} else if (type.equalsIgnoreCase("png")) {
				socialMedia.setScaleRatio(37);
			} else {
				socialMedia.setScaleRatio(45);
			}
		}

	}

	public void resize(SocialMedia socialMedia, String type) {
		socialMedia.changeScaleRatio(type);
	}
}
