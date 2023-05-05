package com.bilgeadam.lesson025.singelton.eager;

public class EvHalkı extends Thread {

	@Override
	public void run() {

		robotCagir();

	}

	public void robotCagir() {

		Robot.getInstance().calis();

	}

}
