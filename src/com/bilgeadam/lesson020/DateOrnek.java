package com.bilgeadam.lesson020;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		LocalDate date4 = LocalDate.of(2005, 8, 06);
		LocalDate date5 = LocalDate.of(2004, Month.AUGUST, 06);
		System.out.println(date4);
		System.out.println(date5);
		System.out.println(date4.getDayOfMonth());
		System.out.println(date4.getYear());
		System.out.println(date4.getMonthValue());
		System.out.println(date4.getDayOfYear());
		System.out.println(date4.getMonth());
		System.out.println(date4.isAfter(date2));
		System.out.println(date4.isBefore(date2));
		System.out.println(date4.isEqual(date5));
		System.out.println(date4.getDayOfWeek());
		System.out.println(date4.getDayOfWeek().getValue());
		System.out.println(date4.isLeapYear());
		System.out.println(date5.isLeapYear());
		System.out.println(date5.plusYears(2));
		System.out.println(date5.plusMonths(1));
		System.out.println(date5.plusDays(10));
		System.out.println(date5.plusWeeks(3));
		System.out.println(date5.minusWeeks(3));
		LocalDate date6 = LocalDate.parse("2022-12-01");
		System.out.println(date6);

		String format = "MM/dd/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		String date7 = LocalDate.now().format(formatter);
		System.out.println(date7);
		String string = "10/12/2020";

		String format2 = "dd/MM/yyyy";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(format2);

		LocalDate date8 = LocalDate.parse(string, formatter);
		System.out.println(date8);
		LocalDate date9 = LocalDate.parse(string, formatter2);
		System.out.println(date9);
		System.out.println(LocalDate.now().format(formatter));
		System.out.println(LocalDate.now().format(formatter2));

		LocalDateTime date10 = LocalDateTime.now();

		LocalDateTime date11 = LocalDateTime.of(2023, 03, 03, 6, 20, 20);

		long ay = date11.until(date10, ChronoUnit.MONTHS);
		long gun = date11.until(date10, ChronoUnit.DAYS);
		long saat = date11.until(date10, ChronoUnit.HOURS);
		System.out.println(ay);
		System.out.println(gun);
		System.out.println(saat);
		long hafta = ChronoUnit.DAYS.between(date11, date10);
		System.out.println(hafta);
//		Period period = Period.between(date11, date10);
//		System.out.println(period.getDays());

		Duration duration = Duration.between(date11, date10);
		System.out.println(duration.getSeconds());

	}

}
