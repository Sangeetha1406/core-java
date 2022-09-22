class A1
{
int id = 1;
String name = "sowmya";
String adress = "Banglore";
String date = "25-08-22";
boolean heartPatient = true;
long contactNo = 2345678l;
String weight = "78 kg";
String gender = "female";
String bloodGrp = "ab+";
public static void main(String args[])
{
	A1 a1=new A1();
System.out.println(" the patient ID is: "+a1.id);
System.out.println(" the patient name is: "+a1.name);
System.out.println(" the patient  date is: "+a1.date);
System.out.println(" is a heart patient:   "+a1.heartPatient);
System.out.println(" the patient contact number is: "+a1.contactNo);
System.out.println(" the patient weight is: "+a1.weight);
System.out.println(" the patient is a male or female: "+a1.gender);
System.out.println(" the patient blood group is: "+a1.bloodGrp);

}
}