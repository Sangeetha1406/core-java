package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class Company {
public static void main(String[] args) {
	Map<String, String>map1=new HashMap<String, String>();
	map1.put("infosys", "softw");
	map1.put("wipro", "it");
	map1.put("capgemani","it");
	
	map1.keySet().forEach(e->System.out.println(e));
	
	map1.values().forEach(e->System.out.println(e));
	
	map1.entrySet().forEach(e->System.out.println(e));
}
}
