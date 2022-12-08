package com.xworkz.relationship;

import com.xworkz.relationship.constant.Gender;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Patient {
	private String name;
	private String address;
	private Gender gender;
	private int age;
	
//	public Patient(String name, String address,Gender gender,int age)
//	{
//		super();
//		this.name=name;
//		this.address=address;
//		this.gender=gender;
//		this.age=age;
//	}
	public void displayInfo()
	{
		System.out.println("The name of patient is: "+ name +	"\n Patient addres is: "+ address + " \n gender is: "+ gender + " " +"\n patient age: "+ age);
	}
}
