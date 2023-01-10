package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Road{
	public Road()
	{
		super();
		System.out.println("walk on Road..");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Highway";
	}


}
