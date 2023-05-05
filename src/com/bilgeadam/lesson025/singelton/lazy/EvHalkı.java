package com.bilgeadam.lesson025.singelton.lazy;

public class EvHalkı extends Thread {

	@Override
	public void run() {

		robotCagir();

	}

	public void robotCagir() {

		Robot.getInstance().calis();

	}

}
