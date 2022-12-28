package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayRunner {
public static void main(String[] args) {
	HolidayDTO holidayDTO1=new HolidayDTO(2022,"deepavali","Novemeber");
	HolidayDTO holidayDTO2=new HolidayDTO(2022,"Ganesh","septamber");
	HolidayDTO holidayDTO3=new HolidayDTO(2022,"sakranthi","january");
	HolidayDTO holidayDTO4=new HolidayDTO(2022,"ugadhi","april");
	HolidayDTO holidayDTO5=new HolidayDTO(2022,"dasara","Novemeber");
	
	boolean equals = holidayDTO1.equals(holidayDTO3);
	System.out.println("matching "+equals);
	Collection<HolidayDTO>holiday=new ArrayList<HolidayDTO>();
	holiday.add(holidayDTO1);
	holiday.add(holidayDTO2);
	holiday.add(holidayDTO3);
	holiday.add(holidayDTO4);
	holiday.add(holidayDTO5);
	boolean contains=holiday.contains(holidayDTO2);
	System.out.println("contains "+contains);
	
	
}
}
