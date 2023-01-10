package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private String duration;
	private String startingMonth;

	public Season()
	{
		System.out.println("seasonsss");
	}
	@Value("rainy")
	public void setName(String name)
	{
		this.name=name;
	}
	@Value("4months")
	public void setDuration(String duration)
	{
		this.duration=duration;
	}
	@Value("june")
	public void setstartingMonth(String startingMonth)
	{
		this.startingMonth=startingMonth;
	}
	public String getName() {
		return name;
	}
	public String getDuration() {
		return duration;
	}
	public String getStartingMonth() {
		return startingMonth;
	}
}
