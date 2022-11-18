package com.xworkz.work;

import com.xworkz.work.work.CoffeePowder;

public class Levista extends CoffeePowder {
	
	String brand;
	
	void lev()
	{
		System.out.println("good in taste "+brand);
	}
	
	void fast()
	{
		System.out.println("we can make instant coffee by " +brand);
	}

	public static void main(String[] args) {
		
		Levista l=new Levista();
		
		l.cl= "brown";
		l.brand="Levista";
		l.color();
		l.health();
		l.lev();
		l.fast();
		
		
		// TODO Auto-generated method stub

	}

}
