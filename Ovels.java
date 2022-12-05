package com;

public class Ovels {

	public static void main(String[] args) {
		
		String str="thisissimplestatement";
		
		str=str.toLowerCase();
		
		int vow=0,cons=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				//System.out.println("vowels");
				vow++;
			}
			else if(str.charAt(i)>='a'||str.charAt(i)<='z')
			{
				//System.out.println("consonents");
				cons++;
			}
		}
		System.out.println("vowels "+vow);
		System.out.println("cons "+cons);

	}

}
