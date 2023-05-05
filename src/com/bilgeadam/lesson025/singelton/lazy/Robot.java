package com.bilgeadam.lesson025.singelton.lazy;

/*
 * 
 * 
 * 1 tane Robotumuz var bu robotumuz çalış metodu var==> Singelton 
 * calıs metoduna  hascode--> numaralı robot çalışıyor 
 * 2- EvHalkı sınıfımız olacak bu sınıfta robot cagır metodumuz olacak 
 * bu metot calısınca bize robottaki çalış metodunu çalıştıracak
 * 3- Test sınıfında 3 tane ev halkı yaratıp aynı anda robotu çağırmaya çalışşınlar
 * ev halkı sınıfımız ==> thread olacak
 * 
 */
public class Robot {

	private static Robot instance;

	private Robot() {
		// TODO Auto-generated constructor stub
	}

	public synchronized static Robot getInstance() {
		if (instance == null) {
			instance = new Robot();
		}
		return instance;
	}

	public void calis() {
		System.out.println(hashCode() + "----> numarali robot çalışıyor");
	}

}
