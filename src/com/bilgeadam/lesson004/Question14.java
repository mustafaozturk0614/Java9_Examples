package com.bilgeadam.lesson004;

/*
 * çarpım tablosu 1 ile 10 arası olacak 
 * 
 *  çift boyutlu bir array 10 10 
 *  1x1=1 
 *  1x2=2
 *  1x3=3 
 *  .
 *  .
 *  .
 *  2x1=2
 *  2x2=4
 *  .
 *  .
 *  .
 *  .
 * 
 * 
 */

public class Question14 {

	public static void main(String[] args) {
		// 3 e 3 çift boutlu array

		String[][] array2 = { { "1x1=1", "1x2=2" }, { "2x1=2", "2x2=4" }, { "3x1=3", "3x2=6" }, { "4x1=4", "4x2=8" }

		};

		String[] array3 = { "a", "b", "c" };

		for (int i = 0; i < array2.length; i++) {

			for (int j = 0; j < array2[i].length; j++) {

			}

		}

		String[][] carpim = new String[10][10];

		for (int i = 0; i < carpim.length; i++) {
			for (int j = 0; j < carpim[i].length; j++) {
				carpim[i][j] = (i + 1) + "x" + (j + 1) + "=" + ((i + 1) * (j + 1));
			}

		}

//		for (int i = 0; i < carpim.length; i++) {
//
//			for (int j = 0; j < carpim[i].length; j++) {
//
//				System.out.println(carpim[i][j]);
//			}
//
//		}
		String[][] array = {

				{ "1x1=1", "1x2=2", "1x3=3" }, { "2x1=2", "2x2=4", "2x3=6" }, { "3x1=3", "3x2=6", "3x3=9" },
				{ "4x1=4", "4x2=8", "4x3=12" }

		};

		for (String[] dizi : carpim) {

			for (String string : dizi) {
				System.out.println(string);
			}

		}

//		for (String[] dizi : carpim) {
//
//			System.out.println(Arrays.toString(dizi));
//
//		}
	}

}
