package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class TestAge {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		LocalDate dob = LocalDate.of(2000, 2, 16);

		Period p = Period.between(dob, today);

		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());

	}

}
