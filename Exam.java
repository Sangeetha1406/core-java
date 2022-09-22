class Exam{
static String name ;
static String joiningDate ;
static double height ;
static long contactNo; 
static boolean isAlive;
static int age;
public static void main(String args[])
{
	System.out.println("main started");
	//initilazation above declaration
	 age = 23;
	 contactNo = 123456789l;
	 height = 4.3;
	 isAlive = true;
	System.out.println("variable before intilization");
    System.out.println(age);
	System.out.println(contactNo);
	System.out.println(height);
	System.out.println(isAlive);
	
	
	System.out.println("variable after intilization");
	System.out.println("the user age is: "+age);
	System.out.println("the user name is: "+name);
	System.out.println("the user joining date is: "+joiningDate);
	System.out.println("the user height is: "+height);
	System.out.println("the user contact number is: "+contactNo);
	System.out.println("main ended");

	
}
}