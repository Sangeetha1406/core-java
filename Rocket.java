package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("india")
	private String country;
	@Value("booster")
	private String name;
	@Value("20000")
	private double budget;
	
	public Rocket()
	{
		System.out.println("creting object with spring");
	}
	public double getBudget() {
		return budget;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	
	

}
