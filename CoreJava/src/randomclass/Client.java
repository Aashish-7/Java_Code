package com.cooforge.exceptions;

import java.util.Scanner;

public class Client {
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "sandeep";
}
	public static void main(String[] args) {
		Client client=new Client();
		System.out.println(client);
		System.out.println(client.toString());
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number for division :");
		int fnum = scan.nextInt();
		System.out.println("Enter second number for division :");
		int snum = scan.nextInt();
		try {
		int division = fnum / snum;//abnormal termination,system defined error messages
		System.out.println("division two numbers is :" + division);
		}catch(Exception exception)
		{
			System.out.println("dont enter zero as denominator");
		}
		System.out.println("Remaining 1000 lines of code.....");
	}

}
