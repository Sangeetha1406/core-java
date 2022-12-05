package com;

public class StringNumber {
	public static void main(String[] args){
		String str = "1234";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
		System.out.println("Does string contain only Digits? : " + result);
	}
}


