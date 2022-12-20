package com.xworkz;

import java.util.Collection;
import java.util.TreeSet;

public class Sweets {
	public static void main(String[] args) {
		String sweet1="Gulab jamun";
		String sweet2="jalebi";
		String sweet3="kheer";
		String sweet4="rasmali";
		String sweet5="rasgulla";
		String sweet6="laddu";
		String sweet7="halwa";
		String sweet8="kulfi";
		String sweet9="ghevar";
		String sweet10="malpua";
		String sweet11="mysore pak";
		String sweet12="peda";
		String sweet13="soan papdi";
		
		Collection<String>collection=new TreeSet();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);//Explicitly
		collection.add(sweet13);
		collection.add("paysa");//implicitly
		
//		System.out.println(collection.size());
//		collection.clear();
		System.out.println(collection.size());
		System.out.println("after clear......");
		collection.clear();
		System.out.println(collection.size());

		
		
		
		
		
	}
}
