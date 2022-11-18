package com.xworkz.work;

import com.xworkz.work.work.SearchEngine;

public class Google extends SearchEngine {
	
	void browser()
	{
		System.out.println("good browser to search");
	}
	
	public static void main(String[] args) {
		
		Google g1=new Google();
		g1.search();
		g1.notFound();
		g1.browser();
	}

}
