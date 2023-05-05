package com.bilgeadam.lesson025.singelton.enums;

public class EvHalkı extends Thread {

	@Override
	public void run() {

		robotCagir();

	}

	public void robotCagir() {

		Robot.ROBOT.calis();

	}

}
