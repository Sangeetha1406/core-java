package com;

public class Countodd {

	public static void main(String[] args) {
	
		int a[]= {2,4,7,4,6,9,3,2,7,9,4,10,23};
		
		int c=0;
		int c1=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even "+a[i]);
				c++;
			}
			else
			{
				System.out.println("odd "+a[i]);
				c1++;
			}
		}
		System.out.println( "even count is "+c);
		System.out.println("odd count is " +c1);
	}

}
