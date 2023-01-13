package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experiance experiance;
	public void director()
	{
		System.out.println("creating hashcode experiance");
		System.out.println(experiance.hashCode());
	}
	

}
