package com.bilgeadam.lesson024.liskovsubstitution;

import com.bilgeadam.lesson024.utility.Notification;
import com.bilgeadam.lesson024.utility.User;

/*
 * 1-Bizim email ve sms gonder metotlarımız var sonra bir faceebok dedi ki ben
 * artık sms gondermeyi desteklemiyorum burdaki sorunu nasıl cozeriz 
 * 
 */
public class Instagram extends SocialMedia implements ISmsSendable, IEmailSendable {

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

}
