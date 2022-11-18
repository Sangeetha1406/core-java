package com.xworkz.work;

import com.xworkz.work.work.Ecommerce;

public class Flipkart extends Ecommerce {
	
	
	
	public void all()
	{
		System.out.println("basic need to all the things yo can get here " +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart f=new Flipkart();
		
		f.b="Flipkart";
		
		f.amz();
		f.flip();
		f.all();
	}

}
