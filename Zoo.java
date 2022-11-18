package com.xworkz.work;

import com.xworkz.work.work.WildLifeSanctuary;

public class Zoo extends WildLifeSanctuary{
	void animl()
	{
		System.out.println("zoo is a area where animals are kept for public exhibition");
	}
	public static void main(String[] args) {
		Zoo wl = new Zoo();
		wl.wild();
		wl.kar();
		wl.animl();
	}
}
