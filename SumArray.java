package com;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();	
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		for(int x=0;x<a.length;x++)
		{
			for(int y=1;y<a.length;y++)
			{
				 sum=(a[x]+a[y]);
				
			}
		}System.out.println("sum is "+sum);
	
	}

}
