package com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		int res=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=s.nextInt();
		int temp=n;
		
		while(n!=0)
		{
			 int rem=n%10;
			 res +=Math.pow(rem, 3);
			 n=n/10;
				
		}
		
		if(res==temp)
		{
			System.out.println("its armstrong " +temp);
		}
		else
		{
			System.out.println("its not armstrong " +temp);
		}

	}

}
