package com;

public class Largest3 {
	public static void main(String[] args) {
		int array[]= {72,34,89,45,56,80,-23};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=0;
				if(array[i]>array[j])
				{
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
					}
			System.out.println(array[i]);
			
			}
		System.out.println(" 3rd largest is "+array[array.length-3]);
		
	}
}


































