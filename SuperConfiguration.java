package com.xworkz;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Map;

@Configuration
@ComponentScan("com.xworkz.things")
public class SuperConfiguration {
	@Bean
	public String rat()
	{
		System.out.println("register bean with framework");
		String s1="how are u";
		return s1;
		
	}
	@Bean
	public String flower()
	{
		System.out.println("register bean with framework");
		String s2="rose";
		return s2;
		
	}
	@Bean
	public String window()
	{
		System.out.println("register bean with framework");
		String s3="windows are in house";
		return s3;
		
	}
	@Bean
	public String chair()
	{
		System.out.println("register bean with framework");
		String s4=new String();
		return s4;
		
	}
	@Bean
	public String table()
	{
		System.out.println("register bean with framework");
		String s5="laptop are in table";
		return s5;
		
	}
	@Bean
	public boolean s1()
	{
		System.out.println("true or false");
		return true;
	}
	@Bean
	public boolean s2()
	{
		System.out.println("true or false");
		return false;
	}
	@Bean
	public boolean s3()
	{
		System.out.println("true or false");
		return true;
	}
	@Bean
	public boolean s4()
	{
		System.out.println("true or false");
		return false;
	}
	@Bean
	public boolean s5()
	{
		System.out.println("true or false");
		return true;
	}
	@Bean
	public double e1()
	{
		System.out.println("register with framework");
		return 1.3;
	}
	@Bean
	public double e2()
	{
		System.out.println("e2 float");
		return 1.2;
	}
	@Bean
	public double e3()
	{
		System.out.println("e3 float");
		return 1.5;
	}
	@Bean
	public double e4()
	{
		System.out.println("e4 float");
		return 1.8;
	}
	@Bean
	public double e5()
	{
		System.out.println("e5 float");
		return 1.9;
	}
	@Bean
	public StringBuffer buf1()
	{
		System.out.println("buffer1");
		StringBuffer f1=new StringBuffer("sheep 1");
		return f1;
	}
	@Bean
	public StringBuffer buf2()
	{
		System.out.println("buffer2");
		StringBuffer f2=new StringBuffer("sheep 2");
		return f2;
	}
	@Bean
	public StringBuffer buf3()
	{
		System.out.println("buffer3");
		StringBuffer f3=new StringBuffer("sheep 3");
		return f3;
	}
	@Bean
	public StringBuffer buf4()
	{
		System.out.println("buffer4");
		
		StringBuffer f4=new StringBuffer("sheep 4");
		return f4;
	}
	@Bean
	public StringBuffer buf5()
	{
		System.out.println("buffer5");
		StringBuffer f5=new StringBuffer("sheep 5");
		return f5;
	}
	@Bean
	public StringBuilder build1()
	{
		System.out.println("build 1");
		StringBuilder g1=new StringBuilder("build a 1");
		return g1;
	}
	@Bean
	public StringBuilder build2()
	{
		System.out.println("buffer2");
		StringBuilder g2=new StringBuilder("build a 2");
		return g2;
	}
	@Bean
	public StringBuilder build3()
	{
		System.out.println("buffer3");
		StringBuilder g3=new StringBuilder("build a 3");
		return g3;
	}
	@Bean
	public StringBuilder build4()
	{
		System.out.println("buffer4");
		
		StringBuilder g4=new StringBuilder("build a 4");
		return g4;
	}
	@Bean
	public StringBuilder build5()
	{
		System.out.println("buffer5");
		StringBuilder g5=new StringBuilder("build a 5");
		return g5;
	}
	@Bean
	public ArrayList arr1()
	{
		System.out.println("array");
		ArrayList<Integer>a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		return a;
		
	}
	@Bean
	public HashMap<String, Integer> m1()
	{
		System.out.println("array");
		HashMap<String,Integer>a1=new HashMap();
		a1.put("apple",1);
		a1.put("orange",2);
		a1.put("grapes",3);
		a1.put("bananna",4);
		a1.put("sitapal",5);
		return a1;
	
		
		
		
		
		
	}
	
	
	
}
