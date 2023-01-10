package com.xworkz;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;


public class Temp {

	public static void main(String[] args) {
	
		Map<String,Double> mp=new HashMap<String, Double>();
		mp.put("shimoga", 30.5D);
		mp.put("davangere", 23.5);
		mp.put("gadag", 32.60);
		mp.put("thirtalli", 26.6D);
		mp.put("raichur", 34D);
		mp.put("kalburgi", 28D);
		mp.put("mysore", 33D);
		mp.put("madileri",26D );
		mp.put("malpe", 41D);
		mp.put("manglore", 32D);
		
		
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
