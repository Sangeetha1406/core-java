package com.xworkz;


import java.util.Arrays;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;

public class President {
	public static void main(String[] args) {
		Map<String, String>map=new HashMap<String, String>();
		map.put("India ", "Ram Nath Kovind");
		map.put("China" , "Xi Jinping");
		map.put("Saudi Arabia", "Salman");
		map.put("Indonesia ", "Joko Widodo");
		map.put("Pakistan ", "Arif Alvi");
		map.put("Turkey ", "Recep Tayyip Erdoğan");
		map.put("Afghanistan ", "Mohammad Hassan Akhund");
		map.put("Iraq ", "Barham Salih");
		map.put("Philippines ", "Rodrigo Duterte");
		map.put("Syria ", "Bashar al-Assad");
		map.put("Bangladesh ", "Abdul Hamid");
		map.put("Nepal ", "Bidhya Devi Bhandari");
		map.put("South Korea", "Yoon Suk-yeol");
		map.put("Jordan ", "Abdullah II");
		map.put("Armenia", "Armen Sarksyan");
		map.put("Israel", "Reuven Rivlin");
		map.put("Kuwait", "Sheikh Nawaf ");
		map.put("Bahrain", "Sheikh Hamad");
		map.put("Singapore", "Halimah Yacob");
		map.put("Maldives", "Ibrahim Mohamed Solih");
		System.out.println("=======entry set=========");
		map.entrySet().forEach(e->System.out.println(e));
		System.out.println("=====sort map asc=======");
		Object key[]=map.keySet().toArray();
		Arrays.sort(key);
		for(int i=0;i<key.length;i++)
		{
			System.out.println(key[i]);
		}
		System.out.println("================update values greater than 10===============");
		for(String val:map.keySet())
		{
			if(val.length()>10)
			{
				map.replace(val, "sangeetha");
			}
		}
		map.entrySet().forEach(e->System.out.println(e));
	}

}
