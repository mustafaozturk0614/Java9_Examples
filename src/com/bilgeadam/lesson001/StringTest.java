package com.bilgeadam.lesson001;

public class StringTest {
	
	public static void main(String[] args) {
		String value=" Merhaba Dünya ";  //ctrl+alt+down
		String value2=" Merhaba Dünya ";
		////**********************////
		System.out.println(value2==value);
		System.out.println(value2.trim()==value.trim()); //
		System.out.println(value2.trim().equals(value));//
		
		System.out.println("/////////////////////////////");
		
		
//	
//		System.out.println(value.charAt(1));
//		System.out.println(value.charAt(value.length()-1));
//		System.out.println(value.length());
//		System.out.println(value.indexOf("r"));
//		System.out.println(value.indexOf("x"));// ilk geçtiği index değerini bulur
//		System.out.println(value2.trim());
//		System.out.println(value.indexOf("a",5));// ,ilk buldugu index değerini 1 arttırıp verir isek sonraki a değerini bulur
//		System.out.println(value.lastIndexOf("a"));// son geçtiği index değerini bulur 
//		System.out.println(value.substring(7));
//		System.out.println(value);
//		System.out.println(value.substring(0,5));
//		System.out.println(value.replace("a", "x"));
//		System.out.println(value);
//		System.out.println(value.endsWith("a"));
//		System.out.println(value.endsWith("x"));
//		System.out.println(value.startsWith("m"));
//		System.out.println(value.startsWith("M"));
//		System.out.println(value.concat(" xxxxxx"));// concat gibi + işaretide iki stringi birleştime işlemi yapar
//		System.out.println(value.contains("ha"));
//		System.out.println(value.contains("ba "));
//		System.out.println(value.contains("ba"));
//		System.out.println(value.toUpperCase());
//		System.out.println(value.toLowerCase());
//		System.out.println(value.equals("Merhaba Dünya"));
//		System.out.println(value.equals("Merhaba dünya"));
//		System.out.println(value.equalsIgnoreCase("merhaba dünya"));
		
		String value3="mustafa";
		String value4="Mustafa";
		String value5= new String("Mustafa");
		
		System.out.println(value3==value4);
		System.out.println(value5==value4); // == referans kontrolu yapar 
		System.out.println(value5.equals(value4)); //equals içerik kontrolu yapar
		System.out.println(value5.equals(value3));
		
		
	}

}
