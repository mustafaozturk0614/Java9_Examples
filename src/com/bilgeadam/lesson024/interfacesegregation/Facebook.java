package com.bilgeadam.lesson024.interfacesegregation;

import com.bilgeadam.lesson024.utility.Notification;
import com.bilgeadam.lesson024.utility.User;

public class Facebook extends SocialMedia implements IEmailSendable, IPostable, IShareableStory, IChatable {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(34);
		} else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(37);
		} else {
			setScaleRatio(45);
		}
	}

	public void sendEmailNotification(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
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
	public void sharePost() {
		// TODO Auto-generated method stub

	}
}
