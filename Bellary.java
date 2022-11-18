package com.xworkz.work;

import com.xworkz.work.work.TouristPlace;

public class Bellary extends TouristPlace {
	void bel()
	{
		System.out.println("Hampi is the famous tourist spot in Bellary");
	}
	public static void main(String[] args) {
		Bellary b = new Bellary();
		b.tour();
		b.mys();
		b.bel();
	}
}
