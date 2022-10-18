package com.shubham;

public class Account {

	private long accNum;
	protected double balance;
	private Person accHolder;//has-a 

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	// Constructor created
	public Account() {
		System.out.println("Empty constructor called");
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	// Methods of account class
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance + "Rs");
	}

	public void withdrawal(double withdrawalAmount) {
		this.balance -= withdrawalAmount;
		System.out.println("Deposit of " + withdrawalAmount + " made. New balance is " + this.balance + "Rs");
	}


}
