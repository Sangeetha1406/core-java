package com;

public class StringSwap {
	public static void main(String[] args) {
		String st1="hai";
		String st2="hello";
		String c=st1+st2;
		
		System.out.println("before swapping");
		System.out.println(c+ " ");
		
		st2=c.substring(0,st1.length());
		st1=c.substring(st2.length());
		c=st1+st2;
		
		System.out.println("after swapping");
		System.out.println(c);
	}
}
