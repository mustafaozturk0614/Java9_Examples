package com.bilgeadam.lesson024.liskovsubstitution;

import com.bilgeadam.lesson024.utility.Notification;
import com.bilgeadam.lesson024.utility.User;

/*
 * 1-Bizim email ve sms gonder metotlarımız var sonra bir faceebok dedi ki ben
 * artık sms gondermeyi desteklemiyorum burdaki sorunu nasıl cozeriz 
 * 
 * 2- Whatsapp sadece video konfraesn ,sohbet ,resim paylas hikaye palyas ozelliklerini destekliyor
 * 	Facebook==> post atabilir resim ,hikayae paylasabilir ,sohbet edebilir
 * 	instagram--> post atabilir resim ,hikayae paylasabilir ,sohbet edebilir
 *   burdaki sorunu bulup cozunuz 
 */
public class Instagram extends SocialMedia implements ISmsSendable, IEmailSendable, IPostable {

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
