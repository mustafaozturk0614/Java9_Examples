package com.bilgeadam.lesson024.singleresponsibility;

import com.bilgeadam.lesson024.utility.User;

public class Test {
	public static void main(String[] args) {

		User user = new User("Mustafa", "mustafa@gmail.com");

		Instagram instagram = new Instagram();
		instagram.sendNotification(user);

	}
}
