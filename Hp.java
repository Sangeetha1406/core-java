package com.xworkz.work;

import com.xworkz.work.work.PetrolBunk;

public class Hp extends PetrolBunk{
	void hppetrol()
	{
		System.out.println("hp stands for hindustan Petrolium");
	}
	public static void main(String[] args) {
		Hp h=new Hp();
		h.bunk();
		h.des();
		h.hppetrol();
	}
}
