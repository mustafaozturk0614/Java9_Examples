package com.bilgeadam.lesson024.interfacesegregation;

import com.bilgeadam.lesson024.utility.Notification;
import com.bilgeadam.lesson024.utility.User;

/*
 * twitter diye bir sosyal medya geldi ve hikaye paylaşma ozelliğini ve 
 * video konferans özelliğini desteklemiyor 
 * 
 * 
 * 
 */
public class Instagram extends SocialMedia
		implements ISmsSendable, IEmailSendable, IPostable, IShareableStory, IChatable {

	@Override
	public void changeScaleRatio(String type) {

		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(38);
		} else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(30);
		} else {
			setScaleRatio(40);
		}
	}

	public void sendEmailNotification(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	public void sendSmsNotification(User user) {
		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
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
