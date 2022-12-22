package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamsNames {
public static void main(String[] args) {
	Collection<String>karnataka=new ArrayList<String>();
	karnataka.add("Anathode Flanking");
	karnataka.add("Anayirangal");
	karnataka.add("Aruvikkara");
	karnataka.add("Azhutha Diversion");
	karnataka.add("Cavaiar");
	karnataka.add("rar");
	karnataka.add("Vani Vilasa Sagara");
	karnataka.add("Cheruthoni (Eb) Dam");
	karnataka.add("Bhairapur");
	karnataka.add("Bharamasagara Doddakere");
	karnataka.add("Bharatagi ");
	karnataka.add("Renuka sagara");
	karnataka.add("upper tunga");
	karnataka.add("bhadra");
	karnataka.add("Tungabhadra");
	karnataka.add("Hemavathi");
	karnataka.add("kabini reservoir");
	karnataka.add("Harangi reservoir");
	karnataka.add("krishna raja sagara");
	karnataka.add("linganamakki");
	karnataka.add("savehaklu reservior");
	karnataka.add("mani reservior");
	karnataka.add("supa dam");
	karnataka.add("kadra");
	karnataka.add("shanti sagara");
	karnataka.add("BRP");
	karnataka.add("Gajnur");
	karnataka.add("almatti dam");
	
	System.out.println(karnataka);
	System.out.println();
	
	System.out.println("===========add all=============");
	Collection<String> coll=new ArrayList<String>();
	{
		coll.addAll(karnataka);
		System.out.println(coll);
	}
	System.out.println("=========Starts with=======");
	Iterator<String> itr=karnataka.iterator();
	while(itr.hasNext())
	{
		String elements=itr.next();
		if(elements.startsWith("T"))
		{
			System.out.println(elements);
		}
	}
	System.out.println("===========Ends with===========");
	Iterator<String> itr1=karnataka.iterator();
	while(itr1.hasNext())
	{
		String elements1=itr1.next();
		if(elements1.endsWith("ra"))
		{
			System.out.println(elements1);
		}
	}
	System.out.println("======removing============");
	Iterator<String> itr2=karnataka.iterator();
	while(itr2.hasNext())
	{
		String elements2=itr2.next();
		if(elements2.contains("p"))
		{
			itr2.remove();
			System.out.println(elements2);
		}
	}
	System.out.println("===============characters=============");
	Iterator<String> itr3=karnataka.iterator();
	while(itr3.hasNext())
	{
		String elements3=itr3.next();
		if(elements3.length()>=15)
		{
			
			System.out.println(elements3);
		}
	}
	System.out.println("=============uppercase===========");
	Iterator<String> itr4=karnataka.iterator();
	while(itr4.hasNext())
	{
		String elements4=itr4.next();
		
		String ele=elements4.toUpperCase();
			
		
			
			System.out.println(ele);
		
	}
	System.out.println("=============lowercase===========");
	Iterator<String> itr5=karnataka.iterator();
	while(itr5.hasNext())
	{
		String elements5=itr5.next();
		//String elements4=itr4.next();
		
		String ele1=elements5.toLowerCase();
			
		
			
			System.out.println(ele1);
		
	}
	System.out.println("==============palindrome==================");
	Iterator<String> itr6=karnataka.iterator();
	while(itr6.hasNext())
	{
		String elements6=itr6.next();
		String rev="";
		for(int i=elements6.length()-1;i>=0;i--)
		{
			rev=rev+elements6.toLowerCase().charAt(i);
		}
		System.out.println(rev);
		if(elements6.equals(rev))
		{
			System.out.println("element is polindrome "+elements6);
		}
	}
}
}
