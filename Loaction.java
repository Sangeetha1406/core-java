package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Loaction {
	@Autowired
	private Area a;
	public void area()
	{
		System.out.println("hashcode company");
		System.out.println(a.hashCode());
	}



}
