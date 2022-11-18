package com.xworkz.work;

public class First {
//name,ifsccode,branchNmae,accountNo
	String name;
	String ifsccode;
	String branchName;
	long accountNo;
	double balance;
	public double deposit(double balance)
	{
		//System.out.println("Amount to be deposited " +balance);
		this.balance=this.balance+balance;
		return this.balance;
	}
	public double withdraw(double balance)
	{
		
		this.balance=this.balance-balance;
		System.out.println("================");
		System.out.println("withdraw amount is " + balance);
		//System.out.println("withdraw amount is " + balance);
		return this.balance;
	}
	public void transfer(double amount,First f)
	
	
	{
	        System.out.println("Transfering to another");
	        withdraw(amount);
	        f.deposit(amount);
	        System.out.println("TRANSFERING DONE");
	}
}
