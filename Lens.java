package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	@Autowired
	private Battery battery;
	
	public void lens()
	{
		System.out.println("creting hashcode lens");
		System.out.println(battery.hashCode());
	}
}
