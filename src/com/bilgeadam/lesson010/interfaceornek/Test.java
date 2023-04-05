package com.bilgeadam.lesson010.interfaceornek;

/*
 * Bir Arac sınıfımız olsun 
 Daha sonra uçak otomobil,kamyon gemi  gibi sınıflarımızıda oluşturalım 
 Gerkirse bu sınıflarada alt sınıflar tanımlayabilirsiniz
 Hızlanma yavaşlama gibi metotlarımız olsun 
 kalkısYap() inişyap() yelkenAc() limanaYanas() sur()(kara tasıtları için dusunelim) gibi metotlarımız olsun 
 Bazı araçlar yuk taşıyabilsinler bunun için yükal ve yükbosalt metotlarımız olsun 
  Bu uygulamayı olusturken interfacelerden yararlanın 

 *  
 *  
 *  bir yukverme metodu olsun dısardan aldıgımız nesne bu metot içinde yuk alsın 
 * 
 */
public class Test {

	public static void main(String[] args) {

		Arac arac1 = new Otomobil();
		Arac arac2 = new Kamyon();

		Arac arac3 = new YolcuGemisi();
		Arac arac4 = new YukGemisi();

		Arac arac5 = new YolcuUcagı();
		Arac arac6 = new KargoUcagı();
		Arac arac7 = new Helikopter();

		arac1.hizlan();
		arac2.hizlan();
		arac3.hizlan();
		arac4.hizlan();
		arac5.hizlan();
		arac6.hizlan();
		arac7.hizlan();

		kalkisİzniVer((Ucak) arac5);
		kalkisİzniVer((Ucak) arac6);
		kalkisİzniVer((Helikopter) arac7);

		IHavaTasiti arac8 = new YolcuUcagı();
		IHavaTasiti arac9 = new KargoUcagı();
		IHavaTasiti arac10 = new Helikopter();
		System.out.println("================");
		kalkisİzniVer(arac10);
		kalkisİzniVer(arac9);
		kalkisİzniVer(arac8);

		IYuk arac11 = new KargoUcagı();
		IYuk arac12 = new Kamyon();
		IYuk arac13 = new YukGemisi();

		yukVer(arac11);
		yukVer(arac12);
		yukVer(arac13);

	}

	public static void kalkisİzniVer(IHavaTasiti havaTasiti) {
		System.out.println("Kalkış izni verildi");
		havaTasiti.kalkisYap();
	}

	public static void yukVer(IYuk tasit) {
		System.out.println("Yuk için tasıt hazırlanıyor....");
		tasit.yukAl();
	}

}
