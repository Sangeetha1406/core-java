package com;

public class ReverseStr {
	public static void main(String[] args) {
		int i=0;
		String a="Sangeetha";
		String rstr=" ";
		for(char b:a.toCharArray() )
		{
			char c=a.charAt(i);
			i++;
			rstr=c+rstr;
		}
		System.out.println(rstr);
	}
}
