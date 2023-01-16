package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class Chocolates {
	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String, Integer>();
		map.put("dairymilk", 75);
		map.put("park", 30);
		map.put("kitkat", 20);
		map.put("much", 10);
		map.put("milkybar", 25);
		
		System.out.println("key of the map");
		map.keySet().forEach(e->System.out.println(e));
		System.out.println("====================");
		System.out.println("values of the map");
		map.values().forEach(e->System.out.println(e));
		System.out.println("======================");
		System.out.println("key and values of the map");
		map.entrySet().forEach(e->System.out.println(e));
		
	}
}
