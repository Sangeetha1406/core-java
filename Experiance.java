package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experiance {
	@Autowired
	private Skill skill;
	public void experiance()
	{
		System.out.println("creting hashcode skill");
		System.out.println(skill.hashCode());
	}
}
