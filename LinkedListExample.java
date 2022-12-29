package com.xworkz;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	List<String>list=new LinkedList();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	
	System.out.println(list);
	System.out.println();
	System.out.println("==addd elemet==");
	list.add("z");
	for(String string:list)
	{
		System.out.println(string);
	}
	System.out.println();
	System.out.println("==addd index and element=====");
	list.add(2, "sangeetha");
	for(String string:list)
	{
		System.out.println(string);
	}
	System.out.println();
	System.out.println("==remove element=====");
	list.remove(0);
	for(String string:list)
	{
		System.out.println(string);
	}
	System.out.println();
	System.out.println("==set index and  element=====");
	list.set(0, "sumanth");
	for(String string:list)
	{
		System.out.println(string);
	}
	System.out.println();
	System.out.println("==get index  element=====");
	System.out.println(list.get(0));
}
}
