package com;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter number");
		int n=s.nextInt();
		
		if(n%2==0)
		{
			System.out.println("even number " +n);
		}
		else
		{
			System.out.println("odd number "+n);
		}
		}

	}

}
