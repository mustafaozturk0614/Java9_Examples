package com.bilgeadam.lesson005;

/*
 *  String sınıfı içinde bulunan istediğiniz 10 adet method u taklit edecek ve türkçe
isimlendirilmiş metodları barındıran CustomStringTR isimli sınıfı yazınız. Örneğin;
• Ifade.length() yerine aynı işlevi yerine getiren ifade.uzunluk() metodunu yazmalısınız
 */
public class CustomStringTR {

	public static void main(String[] args) {

		System.out.println(indexdekiKarakteriBul("Java", 1));
		System.out.println(birlestirme("Merhaba ", "Dünya"));
		System.out.println(karakterinIndexiniBulma("Mustafa", 'f'));

	}

	public static char indexdekiKarakteriBul(String kelime, int index) {
		return kelime.charAt(index);
	}

	public static String birlestirme(String metin1, String metin2) {
		return metin1.concat(metin2);
	}

	public static int karakterinIndexiniBulma(String kelime, char karakter) {
		return kelime.indexOf(karakter);

	}

	public static String buyukHarfeCevirme(String kelime) {

		return kelime.toUpperCase();
	}

	public static String kuckHarfeCevirme(String kelime) {

		return kelime.toLowerCase();
	}

	public static String ayirma(String kelime, int start) {

		return kelime.substring(start);
	}

	public static String ayirma(String kelime, int start, int end) {

		return kelime.substring(start, end);
	}

	public static String bastakiVeSondakiBosluklarıTemizle(String kelime) {

		return kelime.trim();
	}

	public static String yerDegistir(String kelime, char eskiKarakter, char yeniKarakter) {

		return kelime.replace(eskiKarakter, yeniKarakter);
	}

	public static boolean esitMi(String deger1, String deger2) {
		return deger1.equals(deger2);

	}

	public static boolean iceriyorMu(String kelime, String deger) {
		return kelime.contains(deger);
	}
}
