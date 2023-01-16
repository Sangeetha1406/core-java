package com.xworkz;


import java.util.ArrayList;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
//import java.util.Map.Entry;
//import java.util.stream.Stream;

public class MobileWithPrice {
	public static void main(String[] args) {
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("oneplusNord", 30000);
		map.put("oneplus",24000);
		map.put("samsung", 20000);
		map.put("iPh", 650000);
		map.put("oppo", 18000);
		map.put("lava", 18000);
		map.put("realme",25000);
		map.put("nokia", 10000);
		map.put("sony", 90000);
		map.put("poco", 17000);
		System.out.println("===========10 entry set============");
		map.entrySet().forEach(e->System.out.println(e));

		System.out.println("======print all entries capital======");
		for (String ref : map.keySet()) {
			System.out.println(ref.toUpperCase());
		}
		System.out.println("======print price greater than 10000========");
		for (Integer a : map.values()) {
			if(a>10000)
			{
				System.out.println(a);
			}

		}
		System.out.println("======less than 5 charaters=======");
		for(String s:map.keySet())
		{
			if(s.length()<5)
			{
				System.out.println(s);
			}
		}
		System.out.println("=====sort and print in des order======");
		List<Map.Entry<String, Integer>>list=new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByKey());
		list.forEach((l)->System.out.println(l.getKey()+ " = " +l.getValue()));;
	}
}


