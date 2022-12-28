package com.xworkz;

import java.io.Serializable;

public class AirportDTO implements Serializable{
	String name;
	String address;
	int alno;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAlno() {
		return alno;
	}
	public void setAlno(int alno) {
		this.alno = alno;
	}
	
	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", address=" + address + ", alno=" + alno + "]";
	}
	
	public AirportDTO(String name, String address, int alno) {
		super();
		this.name = name;
		this.address = address;
		this.alno = alno;
	}
	
	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from airportDTO");
		if(reference != null)
		{
			if(reference instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO) reference;
				
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching" + dto.name);
					return true;
				}
			}
		}
		return false;
	}
	
	
}
