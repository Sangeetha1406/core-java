package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Loaction loc;
	@Autowired
	private Area area;
	public void show()
	{
		System.out.println("creating location company");
		System.out.println(loc.hashCode());
		System.out.println("creating area hashcode");
		System.out.println(area.hashCode());

	}

}
