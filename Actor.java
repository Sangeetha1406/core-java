package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	private String name;
	private String language;
	private int age;
	
//	public Actor()
//	{
//		System.out.println("actorsss.....");
//	}
	public Actor(@Value("radhika")String name,@Value("kannada")String language,@Value("35")int age)
	{
		this.name=name;
		this.language=language;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getLanguage() {
		return language;
	}
}
