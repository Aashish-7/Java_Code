package com.shubham;

public class CurrentAccount extends Account {
		double overdraftLimit=2000;
		@Override
		public void withdrawal(double withdrawalAmount) {
				if(overdraftLimit<withdrawalAmount)
				{
					System.out.println("Limit Reached .....TRUE");
				}
		}
		
		public static void main(String[] args) {
			Person person=new Person();
			person.setName("smith");
			person.setAge(28);
			CurrentAccount ca=new CurrentAccount();
			ca.setBalance(10000);
			ca.setAccHolder(person);
			ca.setAccNum(1234);
			
			ca.withdrawal(3000);
		}
}
