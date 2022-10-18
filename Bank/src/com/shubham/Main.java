package com.shubham;

import java.util.Random;

public class Main {
	
	static long getAccountNo()
	{
		Random random=new Random();
		long accNum=random.nextInt(10000);
		return  accNum;
		
	}
	public static void main(String[] args) {

		Person person=new Person();
		person.setName("smith");
		person.setAge(28);
		
		Person person1=new Person();
		person1.setName("kathy");
		person1.setAge(30);
		
		Account account=new Account(getAccountNo(), 2000, person);
		
		Account account1=new Account(getAccountNo(), 3000, person1);
		
		
		account.deposit(2000);
		account1.withdrawal(2000);
		
		System.out.println(account);
		System.out.println(account1);
		System.out.println(account.getBalance());
		System.out.println(account1.getBalance());
		
//		Account shubhamAccount1 = new Account("1800102", 3000, "kathy", "choubey@gmail.com",
//				"8882604348");
//		Account shubhamAccount = new Account("1800101", 9000, "Shubham Choubey", "shubhamchoubey96@gmail.com",
//				"8882604348");
//		
//		System.out.println(shubhamAccount.getNumber());
//		System.out.println(shubhamAccount.getBalance());
//		
//		shubhamAccount.deposit(4000);
//		shubhamAccount.withdrawal(1200);
//
//		shubhamAccount.deposit(8000);
//		shubhamAccount.withdrawal(2000);

	}

}
