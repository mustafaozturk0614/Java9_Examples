package com.bilgeadam.lesson014.queue;

/*
 * musteride bir banaknın musterisi olup olmadıgını tutan bir ozellik olsun 
 * birde sıra numarası ozelliği olsun 
 * birde mustresinin ismi olsun 
 * 
 * daha sonra banka sınıfımzda birden çok müsteri olusturarark 
 * banka musteri olanlara oncelik versin 
 * banka musterileri arasındada sıra numarasına gore sıralama yapsın 
 * 
 * 
 * 
 */
public class Musteri {// implements Comparable<Musteri>
	String isim;
	int siraNo;
	boolean musterMi;

	public Musteri(String isim, int siraNo, boolean musterMi) {
		super();
		this.isim = isim;
		this.siraNo = siraNo;
		this.musterMi = musterMi;
	}

	@Override
	public String toString() {
		return "Musteri [isim=" + isim + ", siraNo=" + siraNo + ", musterMi=" + musterMi + "]";
	}

//	@Override
//	public int compareTo(Musteri o) {
//		if (musterMi) {
//			return -1;
//		} else if (!musterMi) {
//
//			return 1;
//		}
//
//		return 0;
//	}

}
