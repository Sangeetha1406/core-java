package com.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{
//	public Diesel()
//	{
//		System.out.println("disel.....");
//	}
	@Override
	public void consume() {
		System.out.println("consumne....");
	}
}
