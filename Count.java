package com;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=s.nextInt();
		
		int count=0;
		
		while(n!=0)
		{
			 n =n/10;
			count++;
		}
       System.out.println(count);
	}

}
