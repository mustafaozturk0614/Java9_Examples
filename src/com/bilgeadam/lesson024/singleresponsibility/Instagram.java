package com.bilgeadam.lesson024.singleresponsibility;

import com.bilgeadam.lesson024.utility.Notification;
import com.bilgeadam.lesson024.utility.User;

/*
 * 
 * sizden bir bildirim gonder metodu yazmanızı  istiyorum  
 * 
 * daha sonra eğer kullanıcın emaili varsa email gondersin 
 * 
 * telefonu varsa sms gondersin  hem telefon hem email varsa ikisinide gondersin 
 * 
 * bildirim gonder metodu() ==> Kullanıcı 
 * 
 * sms ==>   0555-555-55-55 ==> smsm gonderiliyor
 * email==> mustafa@gmail.com ==> email gonderiliyor
 * 
 * 
 */
public class Instagram {

	/*
	 * 1. basamakda bir send notification metodu yazdık metoda gonderilen userın
	 * telefon ve emailini kontrol ettik ona gore if yapısı ile bildirim gonderdik
	 * fakat bu metodun single responsibility e uymadıgını farkettik ve 2. basamaga
	 * geçtik
	 * 
	 * 
	 */
	public void sendNotification(User user) {

		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}

		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
		}

	}

	/*
	 * 2. basamak yukarida ki metodu gorevlerine gore 2 ye bolup 2 ayrı metot yazdık
	 * ve single responsibility e uygun hale getirdik
	 * 
	 */
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
