package com.bilgeadam.lesson005;

/*
 * Soru 3. (15p) karakterSayici isimli static bir Java metodu yazınız. Bu metod bir String bir de char 
değişkenini parametre olarak alacaktır. Fonksiyon paramtre olarak gelen String içindeki yine parametre
olarak gelen karakterin sayısını sayıp return edecektir.
Fonksiyonun örnek kullanımı:
Örnek kullanım 1:
karakterSayici("Bugün güzel bir gün", 'g') Şeklinde main içinden çağırıldığında ekrana 3 yazacaktır.
Örnek kullanım 2:
karakterSayici("Bugün güzel bir gün", 'x') Şeklinde main içinden çağırıldığında ekrana 0 yazacaktır.
 * 
 * 
 */
public class KarakterSayici {

	public static void main(String[] args) {

		System.out.println(karakterSayisiBul("Bugün güzel bir gün", 'b'));

	}

	public static int karakterSayisiBul(String kelime, char karakter) {

		int sayac = 0;
		for (int i = 0; i < kelime.length(); i++) {

			if (kelime.charAt(i) == karakter) {
				sayac++;
			}
		}
		return sayac;
	}

}
