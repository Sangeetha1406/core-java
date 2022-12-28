package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceRunner {
	public static void main(String[] args) {
		
	
	PlaceDTO placeDTO1 = new PlaceDTO("gajnur","shimoga","dam");
	PlaceDTO placeDTO2 = new PlaceDTO("jog","shimoga","falls");
	PlaceDTO placeDTO3 = new PlaceDTO("lalbag","banglore","park");
	PlaceDTO placeDTO4 = new PlaceDTO("grs","mysore","fantacy park");
	PlaceDTO placeDTO5 = new PlaceDTO("malpe","udupi","beach");
	
	
	boolean equals = placeDTO1.equals(placeDTO3);
	System.out.println("matching "+equals);

	Collection<PlaceDTO> place = new ArrayList<PlaceDTO>();
	place.add(placeDTO1);
	place.add(placeDTO2);
	place.add(placeDTO3);
	place.add(placeDTO4);
	place.add(placeDTO5);
	boolean contains=place.contains(placeDTO2);
	System.out.println("contains "+contains);	
}}

