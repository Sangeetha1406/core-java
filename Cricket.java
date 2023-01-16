package com.xworkz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cricket {
	public static void main(String[] args) {
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("RohithSharma", 12000);
		map.put("dhoni", 12500);
		map.put("Yuvraj", 300);
		map.put("ABD", 400);
		map.put("kohil", 500000);

		System.out.println("======enteries cricket======");
		map.entrySet().forEach(e->System.out.println(e));

		System.out.println("====remove an entry======");
		Iterator<Integer> iterator = map.values().iterator(); 
		while(iterator.hasNext() ) {
			Integer key = iterator.next();
			if(key <10000 ) {
				iterator.remove();
			}
		}
		map.entrySet().forEach(e->System.out.println(e));
		System.out.println("===print descending order=======");
//		LinkedHashMap<String, Integer>sort=new LinkedHashMap<String, Integer>();
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e->sort.put(e.getKey(),e.getValue()));
//		map.entrySet().forEach(e->System.out.println(e));
		Map<String, Integer>map1=new TreeMap<String, Integer>(map);
		map1.putAll(map);
		Set s=map.entrySet();
		Iterator itr2=s.iterator();
		while(iterator.hasNext())
		{
			Map.Entry e=(Map.Entry)itr2.next();
			System.out.println(e.getKey()+ " " +e.getValue());
			
		}
		map.entrySet().forEach(e->System.out.println(e));
		
	}
	
}


