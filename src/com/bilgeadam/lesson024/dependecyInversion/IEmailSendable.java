package com.bilgeadam.lesson024.dependecyInversion;

import com.bilgeadam.lesson024.utility.User;

public interface IEmailSendable {

	void sendEmailNotification(User user);

}
