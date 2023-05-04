package com.bilgeadam.lesson024.openclosed;

/*Open Closed
 * 
	1- Resim boyutlandırma sınıfımız olacak bu sınıfn içinde boyutlandırma metotu yazacağız 
  bu metot	bizden  bir instagramı alacak birde String type alacak ve işlemler yapacak
  eğer type jpg ise kucultme katsayısı 38 eğer png ise 30 olsun   default 40
 * 
 * 2-Yeni bir sosyal medya uygulaması daha eklendi uygulamamıza facebook
 * facebook için  jpg kucultme katsayısı 34 png 37 default 45
 * boyutlandırma2 metodunu yazalım burda facebookda göz önune alınsın ==> facebook 
 * içinde çalışabilir instagram içinde  
 * 3- whatsapp da ekleyelim  jpg 28 png 32 default 36
 * 
 * 
 */
public class Instagram extends SocialMedia {

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

}
