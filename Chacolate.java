package com.xworkz;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;


public class Chacolate {

	public static void main(String[] args) {
	
		Map<String,Double> mp=new HashMap<String, Double>();
		mp.put("dairy milk", 60D);
		mp.put("kit kat", 65D);
		mp.put("perk", 5.60);
		mp.put("alpenlibe", 740D);
		mp.put("munch", 15D);
		mp.put("milky bar", 45D);
		mp.put("snikers", 100D);
		mp.put("kiss me",20D );
		mp.put("5 star", 55D);
		mp.put("temtation", 570D);
		
		
		System.out.println("keys of the given map");
		mp.keySet().forEach(e->System.out.println(e));
		
		System.out.println("===================");
		
		System.out.println("values of the given map");
		mp.values().forEach(e->System.out.println(e));
		
		System.out.println("===========================");
	
		
		System.out.println("both values and keys");
		mp.entrySet().forEach(e->System.out.println(e));
	}

}
