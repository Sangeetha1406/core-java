package com.xworkz;

import java.util.Scanner;

import com.xworkz.relationship.Apolo;
import com.xworkz.relationship.Patient;
import com.xworkz.relationship.constant.Gender;

public class ApoloTester {


public static void main(String[] args) {
	int n=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size ");
	int size=sc.nextInt();
	
	Apolo ap=new Apolo(size);
	for(int i=0;i<size;i++ )
	//Patient patient=new Patient();
	
	{	
		
	Patient patient=new Patient();
	
	System.out.println("enter the patient name");
	patient.setName(sc.next());
	System.out.println("enter patient age");
	patient.setAge(sc.nextInt());
	System.out.println("enter patient gender");
	patient.setGender(sc.next());
	System.out.println("enter patient adrres");
	patient.setAddress(sc.next());
	ap.added(patient);
	n=n+1;
	}	
	
	ap.getPatient();
	System.out.println("enter patient gender to search patient name");
	//String gender=sc.next();
	ap.getPatientNameByGender(Gender.valueOf(sc.next()));
	
	System.out.println("enter patient name to search");
	//String patientName=sc.next();
	ap.getPatientByName(sc.next());
	
	System.out.println("enter patient age to search");
	//int patientAge=sc.nextInt();
	ap.getPatientByAge(sc.nextInt());
	
	System.out.println("enter patient address to search");
	//String patientAddres=sc.next();
	ap.getPatientByAddress(sc.next());
	
	
	
	System.out.println("enter patient name to search a patient gender");
	//String PatientName=sc.n--ext();
	ap.getGenderByPatientName(sc.next());
	
	
	
	
}
}
