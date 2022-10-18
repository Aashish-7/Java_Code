package com.shubham;

public class SavingAccount extends Account {
public final double minmumBalance=500; 


@Override
	public void withdrawal(double withdrawalAmount) {
	if (this.balance - withdrawalAmount < 0) {
		System.out.println("only " + this.balance + "Rs" + " available.Withdrawal not processed");
	} else {
		this.balance -= withdrawalAmount;
		System.out.println("Withdrawal of " + withdrawalAmount + "Rs" + " processed. Remaining balance = "
				+ this.balance + "Rs");
	}
	}
}
