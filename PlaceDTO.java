package com.xworkz;

import java.io.Serializable;

public class PlaceDTO implements Serializable{
	String name;
	String Districts;
	String touristPlace;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistricts() {
		return Districts;
	}
	public void setDistricts(String districts) {
		Districts = districts;
	}
	public String getTouristPlace() {
		return touristPlace;
	}
	public void setTouristPlace(String touristPlace) {
		this.touristPlace = touristPlace;
	}
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", Districts=" + Districts + ", touristPlace=" + touristPlace + "]";
	}
	
	
	public PlaceDTO(String name, String districts, String touristPlace) {
		super();
		this.name = name;
		this.Districts = districts;
		this.touristPlace = touristPlace;
	}
	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from placeDTO");
		if(reference != null)
		{
			if(reference instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO) reference;
				
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching" + dto.name);
					return true;
				}
			}
		}
		return false;
	}
	
	
}
