package com.bilgeadam.lesson006_oop;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.ad = "Mustafa";// 1
		student1.kayit();
		System.out.println(student1.ad + "->" + student1.no);
		Student student2 = new Student();
		student2.ad = "Doruk";// 2
		student2.kayit();

		System.out.println(student1.ad + "->" + student1.no);

		Student student3 = new Student();
		student3.ad = "Merve";
		student3.kayit();

		System.out.println("Kayıtlı ogrenci sayısı=>" + Student.index);

	}

}
