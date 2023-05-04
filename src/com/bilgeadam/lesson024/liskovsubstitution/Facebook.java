package com.bilgeadam.lesson024.liskovsubstitution;

import com.bilgeadam.lesson024.utility.Notification;
import com.bilgeadam.lesson024.utility.User;

public class Facebook extends SocialMedia implements IEmailSendable {

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
}
