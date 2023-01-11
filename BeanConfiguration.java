package com.xworkz.configuration;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.configuration.bean.Hardwareshop;

@Configuration
@ComponentScan("com.xworkz")
public class BeanConfiguration {
	@Bean
	public Integer ids()
	{
		System.out.println("created Hardwareshop");
		int ide=10;
		return ide;

	}
	@Bean
	public String names()
	{
		System.out.println("created name Hardwareshop");
		return "infosys";
	}
	@Bean
	public String gstNumber()
	{
		System.out.println("created gst Hardwareshop");
		return "s123t";
	}
	@Bean
	public String ownerNames()
	{
		System.out.println("created owner Hardwareshop");
		return "sangeetha";
	}
	@Bean
	public String add()
	{
		System.out.println("created add  Hardwareshop");
		return "banglore";
	}
	@Bean
	public String nam()
	{
		System.out.println("create a method with name");
		return "prime";
	}
	@Bean
	public String vaersions()
	{
		System.out.println("create a method with versions");
		String ref="1.8ver";
		return ref;
	}

	@Bean
	public String developers()
	{
		System.out.println("create method with developer");
		return "sangeetha";
	}
	@Bean
	public LocalDate dat()
	{
		System.out.println("create method with date");
		return LocalDate.of(2022, 01, 11);
	}
	@Bean
	public boolean frees()
	{
		System.out.println("create method with free");
		return false;
	}
	@Bean
	public String name()
	{
		System.out.println("create software engineer method with name");
		return "sumanth";
	}
	@Bean
	public Integer sal()
	{
		System.out.println("create software engineer method with sal");
		Integer r=20000;
		return r;
	}
	@Bean
	public String compy()
	{
		System.out.println("create software engineer method with compny name");
		return "infosys";

	}
	@Bean
	public String exp()
	{
		System.out.println("create software engineer method with name");
		return "4 years";
	}
	@Bean
	public String name1()
	{
		System.out.println("create pencil method with name");
		return "Apsara";
	}
	@Bean
	public String typ()
	{
		System.out.println("create pencil method with type");
		return "with rubber";
	}
	@Bean
	public Integer pric()
	{
		System.out.println("create pencil method with price");
		Integer i=12;
		return i;

	}
	@Bean
	public String clr()
	{
		System.out.println("create pencil method with clr");
		return "black";
	}
	@Bean
	public boolean sharp()
	{
		System.out.println("create pencil method with sharp");
		return true;
	}
	@Bean
	public boolean stl()
	{
		System.out.println("create pencil method with stl");
		return false;
	}
	@Bean
	public String nam1()
	{
		System.out.println("create rubber method with name");
		return "natraj";
	}
	@Bean
	public String types()
	{
		System.out.println("create rubber method with type");
		return "without dust";
	}
	@Bean
	public Integer prices()
	{
		System.out.println("create rubber method with type");
		int p=5;
		return p;
	}
	@Bean
	public String colors()
	{
		System.out.println("create rubber method with color");
		return "white";
	}
	@Bean
	public String shapes()
	{
		System.out.println("create rubber method with shape");
		return "square";
	}
	@Bean
	public boolean stl1()
	{
		System.out.println("create pencil method with stolen");
		return false;
	}
	@Bean
	public Integer sizes()
	{
		System.out.println("create pencil method with size");
		int s=23;
		return s;
	}
	@Bean
	public String names1()
	{
		System.out.println("create pencil method with names");
		return "apple";
	}
	@Bean
	public String clr1()
	{
		System.out.println("create pencil method with color");
		return "red";
	}
	@Bean
	public String shp()
	{
		System.out.println("create pencil method with shp");
		return "round";
	}
	@Bean
	public boolean helath()
	{
		System.out.println("create pencil method with health");
		return true;
	}
	@Bean
	public boolean stoln()
	{
		System.out.println("create pencil method with health");
		return false;
	}
	
	@Bean
	public boolean prt()
	{
		System.out.println("create pencil method with protien");
		return true;
	}
	@Bean
	public String brd()
	{
		System.out.println("create pencil method with breed");
		return "hybrid";
	}
	@Bean
	public String bught()
	{
		System.out.println("create pencil method with bought");
		return "peoples";
	}
	
	@Bean
	public Integer pric1()
	{
		System.out.println("create pencil method with names");
		int t=20;
		return t;
	}
	
	
	
	
	
}
