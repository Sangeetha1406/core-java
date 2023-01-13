package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;
	
	public void camera()
	{
		System.out.println("creting hashcode camera on lens");
		System.out.println(lens.hashCode());
		System.out.println("creting hashcode camera on battery");
		System.out.println(battery.hashCode());
	}
}
