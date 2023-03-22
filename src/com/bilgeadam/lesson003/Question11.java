package com.bilgeadam.lesson003;

/**
 * 
 * bir dizide 13 var ise 13 ve bir sonraki elaman 
 * toplama eklenmenden toplam sonucu bulan algoritma 
 *
 */

public class Question11 {
	

	public static void main(String[] args) {
		int [] nums= {1,13,13,13,13,5,1,13,1};
		
		int toplam=0;
		int toplam13=0;
	 int	sayac=0;
		
	 //1.çözüm son elaman 13 olursa hata fırlatıyor
	 for (int i = 0; i < nums.length; i++) {
		toplam+=nums[i];
		if (nums[i]==13) {
			toplam13+=nums[i]+nums[i+1];
			if (nums[i]==13 && nums[i+1]==13) {
				sayac++;
			}
		}	 
	}
	 
	 System.out.println(toplam-toplam13+(sayac*13));
	 
	// 2. cözüm
	 		int [] nums2= {1,13,13,5,5,5,13,2,13};
	 int sum=0;
	 
	 for (int i = 0; i < nums2.length; i++) {
		 if(nums2[i]==13) {
			 if(nums2.length>i+1&&nums2[i+1]!=13) {
		  	 i++;
			 }
		 }
		 else {
			 sum+=nums2[i];
		 }

	}
	 System.out.println(sum);
	 
	}
	
}
