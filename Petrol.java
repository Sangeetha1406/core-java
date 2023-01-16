package com.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{
//	public Petrol()
//	{
//		System.out.println("petrol......");
//	}
	@Override
	public void consume() {
		System.out.println("petrolllll....");
	}

}
