package com.bilgeadam.lesson023;

/*
 * para çek 
 * para yatır
 * 
 * para cek metodunda kontrol yapacagız bakiyemiz çekilecek tutardan kucuk ise işlem yapamasın veya  bize 
 * bakiye yetersiz uyarısı versin eğer değilse dışardan girilen değeri bakiyeden duşsun
 * 
 *  para yatır dısarıdan girilen değeri bakiyeye ekleyelim
 *  
 *  yine test sınıfında 2 thread tanımlayalım ve bu thread ler 100 kere donsun 
 * 
 *  her defasında 100 tl ceksin 
 *  
 * 
 * 
 * 
 */
public class Hesap {

	int bakiye = 10000;
	Object lock1 = new Object();
	Object lock2 = new Object();

	public void paraYatir(int para) {
		synchronized (lock2) {
			bakiye += para;
			System.out.println(Thread.currentThread().getName() + "==> para yatırdı");
		}

	}

	public boolean paraCek(int para) {
		synchronized (lock1) {
			if (bakiye >= para) {
				bakiye -= para;
				System.out.println(Thread.currentThread().getName() + "==> para çekti");
				return true;
			} else {

				System.out.println(Thread.currentThread().getName() + "---> Yetersiz bakiye");
				return false;
			}
		}

	}

}
