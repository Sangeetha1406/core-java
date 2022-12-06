package com.xworkz.relationship;

import com.xworkz.relationship.constant.Gender;

public class Apolo extends Hospital{
	public Patient[] patients;
	int index;
	
	public  Apolo(int size)
	{
		patients=new Patient[size];	
	}
	public boolean added(Patient patient)
	{
		System.out.println("inside addPatient method");
		boolean isPatientAdded=false;
		if(patient!=null)
		{
			System.out.println("patients details are registered");
			patients[index++]=patient;
			isPatientAdded=true;
			//index++;
		}
			
	return isPatientAdded;
	}
	public void getPatient()
	{
		for(int i=0;i<patients.length;i++)
		{
			System.out.println(this.patients[i].getName());
			System.out.println(this.patients[i].getAge());
			System.out.println(this.patients[i].getGender());
			System.out.println(this.patients[i].getAddress());
			System.out.println("===========================");
			System.out.println("===========================");
		}
	}
	public void getPatientByName(String patientName)
	{
		System.out.println("inside getPatientName");
		//System.out.println("No of parameters :  1 : patientName(String)");
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i].getName().equals(patientName))
			{
				System.out.println("patient found");
				System.out.println(patients[i].getName());
				System.out.println(patients[i].getAge());
				System.out.println(patients[i].getGender());
				System.out.println(patients[i].getAddress());
				
			}
			
		}
	}
		public void getPatientByAge(int patientAge)
		{
			System.out.println("inside getPatient age");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getAge() ==  patientAge)
				{
					System.out.println("patient found");
					System.out.println(patients[i].getName());
					System.out.println(patients[i].getAge());
					System.out.println(patients[i].getGender());
					System.out.println(patients[i].getAddress());
					
				}
			}
		}
		
		public void getPatientByAddress(String patientAddres)
		{
			System.out.println("inside getPatient addres");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getAddress().equals(patientAddres))
				{
					System.out.println("patient found");
					System.out.println(patients[i].getName());
					System.out.println(patients[i].getAge());
					System.out.println(patients[i].getGender());
					System.out.println(patients[i].getAddress());
					
				}
			}
		}
		public void getPatientNameByGender(Gender gen)
		{
			System.out.println("inside getPatient gender");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getGender().equals(gen))
				{
					System.out.println("patient found");
					
					System.out.println(patients[i].getName());
					
				}
			}
		}
		public void getGenderByPatientName(String PatientName)
		{
			System.out.println("inside getGender by patientName");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getName().equals(PatientName))
				{
					System.out.println("patient found");
					System.out.println(patients[i].getGender());
				}
			}	
		}
//	getPatientByAge(in age)
//	getPatientByGender(Gender gender)
//	getPatientByAddress(String address)
//	getPatientNameByGender(Gender)
//	getGenderByGender()
	
}
 

