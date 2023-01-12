package com.xworkz.bean;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Gender;
import com.xworkz.things.Type;

@Configuration
@ComponentScan("com.xworkz.things")
public class BeanConfiguration {
	@Bean
	public Integer ids()
	{
		System.out.println("registered id");
		int a=101;
		return a;
	}
	@Bean
	public String names()
	{
		System.out.println("registered name");
		return "sumanth";		
	}
	@Bean
	public String ownerNames()
	{
		System.out.println("registered ownerName");
		return "sangeetha";
	}
	@Bean
	public String lang()
	{
		System.out.println("register language");
		return "kannada";
	}
	@Bean
	public Double prc()
	{
		System.out.println("register price");
		return 20.34;
	}
	//	-------------------------------------------------
	@Bean
	public String names1()
	{
		System.out.println("register name");
		return "german engine";
	}
	@Bean
	public Type types()
	{
		System.out.println("register type");
		return Type.big;
	}
	@Bean
	public String comp()
	{
		System.out.println("register company");
		return "jerman";
	}

	@Bean
	public Integer num()
	{
		System.out.println("register number");
		int n=13;
		return n;
	}
	@Bean
	public Double ver()
	{
		System.out.println("register version");
		return 1.4;
	}
	@Bean 
	public Boolean str()
	{
		System.out.println("register stroke");
		return false;
	}
//----------------------------------------------
	@Bean
	public String sname()
	{
		System.out.println("register name");
		return "red cobra";
	}
	@Bean
	public Double slength()
	{
		System.out.println("register length");
		return 1.4;
	}
	@Bean
	public String scolor()
	{
		System.out.println("register name");
		return "red";
	}
	@Bean
	public Type stype()
	{
		System.out.println("register type");
		return Type.big;
	}
	@Bean 
	public Boolean spisionous()
	{
		System.out.println("register spisionous");
		return true;
	}
//	---------------------------------------------------------
	@Bean
	public String gname()
	{
		System.out.println("register name");
		return "suhas";
	}
	@Bean
	public Double gheight()
	{
		System.out.println("register height");
		return 5.6;
	}
	@Bean
	public Type gnailLength()
	{
		System.out.println("register nail");
		return Type.big;
	}
	@Bean
	public Boolean gisDeath()
	{
		System.out.println("register death");
		return true;
	}
	@Bean
	public Integer gage()
	{
		System.out.println("registered age");
		int g=23;
		return g;
	}
	@Bean
	public LocalDate gbirth()
	{
		System.out.println("register birth");
		return LocalDate.of(2000, 04, 06);
	}
	@Bean
	public LocalDate gdeath()
	{
		System.out.println("register death");
		return LocalDate.of(2020, 05, 07);
	}
	@Bean
	public String gsiblings()
	{
		System.out.println("register siblings");
		return "brother";
	}
	@Bean
	public String gbrtplace()
	{
		System.out.println("register gbrtplace");
		return "gajnuru";
	}
	@Bean
	public String gdeathplace()
	{
		System.out.println("register gdeathplace");
		return "shimoga";
	}
	@Bean
	public String gdress()
	{
		System.out.println("register gdress");
		return "saree";
	}
	@Bean
	public String gcolor()
	{
		System.out.println("register gcolor");
		return "white";
	}
	@Bean 
	public Boolean glegs()
	{
		System.out.println("register glegs");
		return true;
	}
	@Bean 
	public Boolean gisghost()
	{
		System.out.println("register is ghost");
		return true;
	}
	@Bean
	public String gprecution()
	{
		System.out.println("register gprecution");
		return "poision";
	}
	@Bean
	public String greason()
	{
		System.out.println("register greason");
		return "love";
	}
	@Bean
	public Gender ggender()
	{
		System.out.println("register gender");
		return Gender.male;
	}
	@Bean
	public Integer gfam()
	{
		System.out.println("register family");
		return 4;
	}
	@Bean
	public String gdeath1()
	{
		System.out.println("register death day");
		return "monady";
	}
	@Bean
	public String gends()
	{
		System.out.println("register ends death day");
		return "few days";
	}
	
	
}
