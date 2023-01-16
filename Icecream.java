package com.xworkz;

import java.util.HashMap;
import java.util.Map;

public class Icecream {
public static void main(String[] args) {
	Map<String, String>map1=new HashMap<String, String>();
	map1.put("butterscoch", "chocolate");
	map1.put("straberry", "berry");
	map1.keySet().forEach(e->System.out.println(e));
	map1.values().forEach(e->System.out.println(e));
	map1.entrySet().forEach(e->System.out.println(e));
	
}
}
