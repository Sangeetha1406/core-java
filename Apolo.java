package com.xworkz.relationship;

import com.xworkz.relationship.constant.Gender;

public class Apolo extends Hospital{
	public Patient[] patients;
	Patient newPatients[];
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
//		@SuppressWarnings("unlikely-arg-type")
//		public void getPatientNameByGender(String gender)
//		{
//			System.out.println("inside getPatient gender");
//			for(int i=0;i<patients.length;i++)
//			{
//				if(patients[i].getGender().equals(gender))
//				{
//					System.out.println("patient found");
//					
//					System.out.println(patients[i].getName());
//					
//				}
//			}
//		}
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
		public void getPatientNameByGender(Gender gen) {
			System.out.println("inside get gender by patient name");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getGender().equals(gen))
				{
					System.out.println(patients[i].getGender());
				}
			}
		}
		public boolean updatePatientAddressByName(String name, String newPatientAddrs)
		{
			boolean isUpdated=false;
			System.out.println("inside updatePatientAddressByName");
			System.out.println("Number of parameters : 2 : 1)param patientName(String) 2)param patientAddrs(String)");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getName().equals(name))
				{
					System.out.println("patient name is matched....proced with update addres");
					patients[i].setAddress(newPatientAddrs);
					isUpdated=true;
				}
			}
			return isUpdated;	
		}
		public void getupdatePatientAddressByName()
		{
			for(int i=0;i<patients.length;i++)
			{
				System.out.println(patients[i].getName());
			}
		}
		public boolean upadtePatientAgeByName(String name, int newAge)
		{
			boolean isUpdated=false;
			System.out.println("inside upadtePatientAgeByName");
			for(int i=0;i<patients.length;i++)
			{
				if(patients[i].getName().equals(name))
				{
					System.out.println("patient age is matched...proced with the update age");
					patients[i].setAge(newAge);
					isUpdated=true;
				}
		}
		
		return isUpdated;
		
}
		public void getupdatePatientAgeByName()
		{
			for(int i=0;i<patients.length;i++)
			{
				System.out.println(patients[i].getName());
			}
		}
		public boolean deletePatientByName(String patientName) {
			boolean isDeleted=false;
			newPatients=new Patient[patients.length-1];
					{
						for(int i=0,k=0;i<patients.length;i++)
						{
							if(!patients[i].getName().equals(patientName))
							{
								newPatients[k++]=patients[i];
								isDeleted=true;
							}
							
						}
					}
					return isDeleted;
		}
		public void getAllNewPatients()
		{
			for(int i=0;i<newPatients.length;i++)
			{
				
				System.out.println("list of patients");
				if(patients[i].getName().equals(newPatients))
				{
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
				}
		}
		
}
}
