package com.xworkz.work;

import com.xworkz.work.work.UnionTerritory;

public class Delhi extends UnionTerritory{
	
		void del()
		{
			System.out.println("Delhi is  a UnionTerritory of india");
		}
		public static void main(String[] args) 
		{
			Delhi d = new Delhi();
			d.cap();
			d.karnataka();
			d.del();
		}
}
