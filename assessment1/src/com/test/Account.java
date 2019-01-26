package com.test;

public class Account {
	public int accountnumber;
	public int balance;
	public static int totalaccounts = 0;
	public Account(int accountnumber, int balance) {
		totalaccounts ++;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	 
	
	public void deposit(int amount) {
		if (amount<0) {
			System.out.println("transaction failed");
		}
		
		else
		{
			 balance = balance + amount;
		}
		 System.out.println(balance);
}
	public void withdraw (int amount) {
		 if (amount<0) {
			 System.out.println("transaction failure..Can't withdraw negative amt");
		 }
		 else if(amount > balance) {
			 System.out.println("insufficient balance");		 
		 }
		 else {
			 System.out.println("transaction successful");
			 balance = balance - amount;
		 }
		System.out.println("available balance" + balance);
	 }
}
