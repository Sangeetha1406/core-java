package com;

public class Swap {

	public static void main(String[] args)
	{
		int first = 25, second = 5;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);//25
        System.out.println("Second number = " + second);//5

        first = first - second;   //20
        second = first + second;  //25
        first = second - first;  //5

        System.out.println("--After swap--");
        System.out.println("First number = " + first);//5
        System.out.println("Second number = " + second);//25
    }


	}

