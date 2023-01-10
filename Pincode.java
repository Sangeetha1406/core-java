package com.xworkz;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;


public class Pincode {

	public static void main(String[] args) {
	
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(577211,"Ayanur");
		mp.put(566123,"bengluru" );
		mp.put(233455,"davangere");
		mp.put(78865,"welor");
		mp.put(12343,"rampur");
		mp.put(766899,"shimoga");
		mp.put(789654,"gadag");
		mp.put(654321,"gajnur" );
		mp.put(871256,"thirtalli");
		mp.put(675231,"hosnagara");
		
		
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
