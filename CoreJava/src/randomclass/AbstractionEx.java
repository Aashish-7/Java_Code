package com.coforge.oops;

interface Bank { // 100%
	public abstract int balEnquiry();

	void deposit(int amount);

	public abstract void withdraw(int amount);
}

abstract class Atm implements Bank {// 0-100%
	int acntBalance = 1234;

	public void withdraw(int amount) {
		acntBalance = acntBalance - amount;
		System.out.println("The remaining balance after withdraw : " + acntBalance);
	}

	public abstract void deposit(int amount);
}

public class AbstractionEx extends Atm {
	public static void main(String[] args) {
		AbstractionEx obj=new AbstractionEx();
		obj.balEnquiry();
		obj.deposit(1200);
		obj.withdraw(100000);
	}

	@Override
	public int balEnquiry() {
		// TODO Auto-generated method stub
		return acntBalance;
	}

	@Override
	public void deposit(int amount) {
		acntBalance = acntBalance + amount;
		System.out.println(acntBalance);

	}

}
