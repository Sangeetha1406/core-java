package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Actor;
import com.xworkz.things.Rocket;
import com.xworkz.things.Season;

@Configuration
@ComponentScan("com.xworkz.things")
public class RocketConfig {
	@Bean
	public Rocket rocky()
	{
		System.out.println("register with bean framework");
		Rocket r=new Rocket();
		return r;
	}
	
	@Bean
	public Actor act()
	{
		System.out.println("adding actor information");
		Actor ac=new Actor("yash","kannada",35);
		return ac;
		
	}
	@Bean
	public Season sea()
	{
		System.out.println("regestiring season with method object");
		Season s1=new Season();
		s1.setName("winter");
		s1.setDuration("2months");
		s1.setstartingMonth("dec");
		return s1 ;
		
	}
}
