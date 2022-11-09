1] Explain JRE,JDK,JVM?
JRE:
	*JRE stands for java run time environment.
	*it helps to run the code.it is present inside the JDK.
	*JRE contains JVM and set of libraries to execute byte code.
JDK:
     *JDK stands for java develpoment kit.
	 *JDK is the software tools.which is used to execute and run the code.
	 *JDK conatins JRE and development tools.
JVM:
	 *JVM stands for java virtual machine.
	 *it is used to execute the codes or program.
	 *JVM perform 3 operatins
		->load the byte code.
		->verify the byte code.
		->execute the byte code.
		
2] Explain the following
	i]	class:    *class is a blue print of an object.
			     *it is a design,it consist of states and behaviour. 
			     *states consist of variables.
			     *behavior consist of methods.
		object:  *anything which is physically exit.
				 *object is a instance of class.
				 *it is a part of real word application.
		static: *static is a keyword.
				 *static is a non-access modifier.
				 *static is used with class,methods,variables.
				 *static can be accessed by the class name.
		public:  *public is a keyword.
				 *it means anyone can access th file.
				 *it can  be access inside the class or outside the class.
		private:  *it is also a keyword.
				 *it can be access with in the class only.
    ii]  public static void main(String[] args)?
		 public:public is a keyword,it is a access modifier,we can access both inside or ouside the class.
		 static:static is a keyword,static is a non-access modifier,static is used with class,methods,variables,static can be accessed by the class name.
		 void: void is a return type.it does not return any value.
		 main:main is a method.program execite from main method only.
		 String[]:String is a non-primitive datatype,We use String array in program because anything we type in program console take String type.
		 args:within parameter we take an arguments,we can decalare anything in argument place.
	
	iii] System.out.println?
			*System is a class,it is used to print the values in program.
			*prinltln means print the values in line by line.

3] What is Array?
		*Array is a collection of homogenious elements.
		* Array is a fixed size.
		*index start from 0.
4] Given array number[]={23,45,56,67,8,12,3,5,7,9,102,34,4,5}
	class Array{
	public static void main(String[] args)
	{
		int n[]={23,45,56,67,8,12,3,5,7,9,102,34,4,5};
		for(int a=0;a<n.length;a++)
		{
			System.out.println(n[a]);
		}
		System.out.println("Even numbers are:");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
		{
			System.out.println("Even number " +n[i]);
		}
		}
		System.out.println("odd numbers are:");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2!=0)
		{
			System.out.println("odd number " +n[i]);
		
		}
		}
	}
}

5] Explain the data types in java and give example for each?
	they are 2 types:
	#primitive:they are 8 primitive data types. 
	#non-primitive:they are 'n' non-primitive data types.
	#primitive:
	*byte
	*short
	*int
	*long
	*char
	*boolean
	*float
	*double
	#non-primitive:
	*String
	*class names

6] What is variables?explain the type with example?
   variables is a registered area allocated in a memory.
   they are 4 types:
   *local variables:any variables which can be declared inside the class and main method.
   *static variables:any variables which can be decalared inside the class and outside the main method,using the static keyword.
   *instance:any variables which can be decalared inside the class and outside the main method,without using the static keyword.
   *paramaterized:it is used by passing the arguments.
   
7] What is constructor?when the class constructor invoke?will a class constructor conatins multiple constructor?explain its types and exmple?
	*set of instructions used for initializtion and instantiation.it doesnot return any value.class name and constructor name should be same.
	*when the object is created,class constructor can invoke.
	*we can create multipe constructor.
	*there are 2 types: default constructor,parameterize constructor.
	
8] simple and secure:its syntax is easy to understand.
	highlevel language:human understandable code.
	portable:easy to carry.
	multithreading:
	robust:strongest programming language.
	Extensible:can be combine with other languages.
	Automatic grabage collector:memory can be authomaticaly managed by the complier rather then doing it manually.
	
9] byte code

10]In static variables and static methods donot need to create object.accessed directly through the class name. 
	
11] explicitly doesnot present,complier automatically generate the values.

12]import java.util.Scanner;
	class Reverse{
	 public static void main(String args[]){
		//Scanner s=new Scanner(System.in);
		int reverse=0;
		int n=1234;
		System.out.println("enter a number");
		//int n=s.nextInt();
		while(n!=0)
		{
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n=n/10;
			
		}
		System.out.println(reverse);
	 }

	}
	
13] factorial?
	class Fact{
	  public static void main(String args[]){
		int i, fact=1;
		int n=5;                                                                                                                              
		for( i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	 }

    }
	
14] sum of digits?

	import java.util.*;
class SumOfDigits{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	
	}


}