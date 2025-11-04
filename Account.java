package com.codegnan.oopexamples;

public class Account {
       private String accountHolder;
       private int accountNumber;
       private double balance;
       public void setAccountHolder(String accountHolder) {
    	   this.accountHolder=accountHolder;
       }
    	   public String getAccountHolder() {
    		   return accountHolder;
    	   }
    	   public void setAccountNumber(int accountNumber) {
    		   this.accountNumber=accountNumber;
       }
    	   public int getAccountNumber() {
    		   return accountNumber;
    	   }
    	   public void setBalance(double balance) {
    		   this.balance=balance;
    	   }
    	   public double getBalance() {
    		   return balance;
    	   }
    	   

     public void deposit(double amount) {
    	 if(amount>0) {
    		 balance+=amount;
    		 System.out.println(amount+"deposited successfully");
    	 }else {
    		 System.out.println("Invalid deposited amount");
    	 }
    	 
     }
     public void withdraw(double amount) {
    	 if(amount<=0) {
    		 System.out.println("Invalid amount");
    	 }else {
    		 if(amount>balance) {
    			 System.out.println("Insufficient balance");
    		 }else {
    			 balance-=amount;
    			 System.out.println(amount+"withdrawn successfully");
    		 }
    	 }
     }
    	 
    	 public void displayAccountInfo() {
    		 System.out.println("Account  Holder:"+accountHolder);
    		 System.out.println("Account  Number:"+accountNumber);
    		 System.out.println("Current Balance:"+balance);
    		 System.out.println("------------------------------------");
    	 }
     }