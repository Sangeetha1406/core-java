import java.util.Scanner;
class DigitCount{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter a number");
		int n=s.nextInt();
		int count=0;
		
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}}