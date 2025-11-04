package com.codegnan.oopexamples;

public class BankApp {

	public static void main(String[] args) {
		Account acc1=new Account();
		acc1.setAccountHolder("suma");
		acc1.setAccountNumber(12345);
		acc1.setBalance(5000);
		acc1.deposit(2000);
		acc1.withdraw(1000);
		acc1.withdraw(8000);
		acc1.displayAccountInfo();

	}

}
