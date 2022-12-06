package com.xworkz.relationship;

public class Hospital {
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient)
	{
		boolean isAdmitted=false;
		if(isTreatmentRequired==true)
		{	
			if(isEmergency==true)
			{
				this.patient=patient;
				System.out.println("patient details");
				this.patient.displayInfo();
				System.out.println("patient can be allowed to eamergency ward");
				
				
				//System.out.println("come and admit");
				
			}
			else
			{
				this.patient=patient;
				this.patient.displayInfo();
				System.out.println("general ward is enough");
			}
		}
		else 
		{
				isAdmitted=true;
				System.out.println("No treatment required");
		}
		
	
	return isAdmitted;
		
	}
}