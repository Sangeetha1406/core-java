package com.xworkz;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerRunner {
	public static void main(String[] args) {
		SanitizerDto sanitizerDto1=new SanitizerDto(101,"Goodbye Germs",100,"green");
		SanitizerDto sanitizerDto2=new SanitizerDto(102,"Sterillium",25,null);
		SanitizerDto sanitizerDto3=new SanitizerDto(103,"Tidy Kitty",30,"blue");
		SanitizerDto sanitizerDto4=new SanitizerDto(104,"Serious Clean",200,"white");
		SanitizerDto sanitizerDto5=new SanitizerDto(105,"Wipe Out",280,"pink");
		SanitizerDto sanitizerDto6=new SanitizerDto(106,"Tweezy",240,"brown");
		SanitizerDto sanitizerDto7=new SanitizerDto(107,"Hanky Panky",0,"green");
		SanitizerDto sanitizerDto8=new SanitizerDto(108,"Handy Andy",300,"blue");
		SanitizerDto sanitizerDto9=new SanitizerDto(109,null,20,"yellow");
		SanitizerDto sanitizerDto10=new SanitizerDto(110,"Degreaser",200,"orange");

		Collection<SanitizerDto> coll=new LinkedList<SanitizerDto>();
		coll.add(sanitizerDto1);
		coll.add(sanitizerDto2);
		coll.add(sanitizerDto3);
		coll.add(sanitizerDto4);
		coll.add(sanitizerDto5);
		coll.add(sanitizerDto6);
		coll.add(sanitizerDto7);
		coll.add(sanitizerDto8);
		coll.add(sanitizerDto9);
		coll.add(sanitizerDto10);

		
		
		
		
		System.out.println();

		System.out.println("=====================Max price value=======================");
		Iterator<SanitizerDto> ref3=coll.iterator();
		Integer max=0;
		for(SanitizerDto val : coll)
		{
			if(val.getPrice()>max)
			{
				max=val.getPrice();

			}


		}

		System.out.println(max);
		while(ref3.hasNext())
		{

			SanitizerDto ele3=ref3.next();

			if(ele3.getPrice()==max)
			{
				System.out.println(ele3);
			}

		}

		System.out.println();

		System.out.println("===========Second largest price value=================");
		Iterator<SanitizerDto> ref5=coll.iterator();
		Integer secondMax=0;
		for(SanitizerDto val : coll)
		{

			if(val.getPrice()<max)
			{

				secondMax=val.getPrice();

			}


		}
		System.out.println(secondMax);
		while(ref5.hasNext())
		{

			SanitizerDto ele5=ref5.next();

			if(ele5.getPrice()==secondMax )
			{
				System.out.println(ele5);
			}

		}

		
		System.out.println("===================price abv 30=====================");

		Iterator<SanitizerDto> ref=coll.iterator();
		while(ref.hasNext())
		{
			SanitizerDto ele=ref.next();
			if(ele.getPrice()>30)
			{
				System.out.println(ele);
			}
		}
		System.out.println();

		System.out.println("============= null values in properties ==========");
		Iterator<SanitizerDto> ref1=coll.iterator();
		while(ref1.hasNext())
		{
			SanitizerDto ele1=ref1.next();
			if(ele1.getBrand()==null || ele1.getColor()==null || ele1.getPrice()==0)
			{
				System.out.println(ele1);
			}
		}
		System.out.println();

		System.out.println("==========remove specified color==========");
		Iterator<SanitizerDto> ref2=coll.iterator();
		while(ref2.hasNext())
		{
			SanitizerDto ele2=ref2.next();
			if("green".equals(ele2.getColor()) || "red".equals(ele2.getColor())||  "blue".equals(ele2.getColor())) 
			{
				ref2.remove();
				System.out.println(ele2);
			}
		}
					System.out.println();

		System.out.println("================min price value========================");
		Iterator<SanitizerDto> ref4=coll.iterator();
		Integer min=0;
		for(SanitizerDto val1 : coll)
		{
			min=max;
			if(val1.getPrice()<min)
			{
				max=val1.getPrice();	

			}



		}
		System.out.println(min);
		while(ref4.hasNext())
		{

			SanitizerDto ele4=ref4.next();

			if(ele4.getPrice()==min)
			{
				System.out.println(ele4);
			}

		}
		System.out.println();
		System.out.println("=======================");

		System.out.println(coll.size());

	}
}
