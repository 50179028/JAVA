package com.test;

public class accountsub {
	public static void main (String args[]) {
		Account account1 = new Account(111,100);
		Account account2 = new Account(222,200);
		Account account3 = new Account(333,100);
		
		account1.deposit(200);
		account2.withdraw(300);
		account2.deposit(-100);
		
		System.out.println(Account.totalaccounts);
	}

}
