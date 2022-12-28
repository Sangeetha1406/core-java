package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;

public class CalenderTester {
	public static void main(String[] args) {
		
		CalenderDTO CalenderDto1 = new CalenderDTO("Bengloru press",2018,"thursday");
		CalenderDTO CalenderDto2 = new CalenderDTO("Bandara",2019,"Monday");
		CalenderDTO CalenderDto3 = new CalenderDTO("Bengloru press",2020,"wednesday");
		CalenderDTO CalenderDto4 = new CalenderDTO("Bhagya Lakshmi",2021,"Friday");
		CalenderDTO CalenderDto5 = new CalenderDTO("Mallige",2022,"Sunday");
		
		boolean equals = CalenderDto1.equals(CalenderDto3);
		System.out.println("matching "+equals);
		
		Collection<CalenderDTO> calender = new ArrayList<CalenderDTO>();
		calender.add(CalenderDto1);
		calender.add(CalenderDto2);
		calender.add(CalenderDto3);
		calender.add(CalenderDto4);
		calender.add(CalenderDto5);
		
		boolean contains = calender.contains(CalenderDto2);
		System.out.println("Contains "+contains);
	}
}
