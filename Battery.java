package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;

	public void bat()
	{
		System.out.println("creting battery");
		System.out.println(capacity.hashCode());
	}

}
