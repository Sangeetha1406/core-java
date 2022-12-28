package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;

public class AirportTester {
	public static void main(String[] args) {
		AirportDTO airportDto1 = new AirportDTO("KempeGowda International Airport","Banglore",8171);
		AirportDTO airportDto2 = new AirportDTO("Anna International Airport","Chennai",5141);
		AirportDTO airportDto3 = new AirportDTO("empeGowda International Airport","Delhi",8171);
		AirportDTO airportDto4 = new AirportDTO("Chhatrapati Shivaji International Airport ","Mumbai",7252);
		AirportDTO airportDto5 = new AirportDTO("Rajiv Gandhi International Airport","Hyderabad",9171);
		
		
		boolean equals = airportDto1.equals(airportDto3);
		System.out.println(airportDto1.getName().equals(airportDto3.getName()));
		Collection<AirportDTO> airport = new ArrayList<AirportDTO>();
		airport.add(airportDto1);
		airport.add(airportDto2);
		airport.add(airportDto3);
		airport.add(airportDto4);
		airport.add(airportDto5);
		boolean contains=airport.contains(airportDto3);
		System.out.println("contains "+contains);	
	}

	

}

