package com.xworkz;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;


public class PgName {

	public static void main(String[] args) {
	
		Map<String,Double> mp=new HashMap<String, Double>();
		mp.put("sai deep", 6000D);
		mp.put("khushi", 6500D);
		mp.put("royal pg", 5500.60);
		mp.put("ram pg", 7400D);
		mp.put("prime pg", 7899D);
		mp.put("nandhini pg", 4500D);
		mp.put("raghavemdra pg", 10000D);
		mp.put("lakshmi",2400D );
		mp.put("blue bells", 5700D);
		mp.put("raghu", 5706D);
		
		
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
