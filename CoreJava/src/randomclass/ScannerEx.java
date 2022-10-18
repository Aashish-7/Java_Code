package com.coforge.basic;

import java.util.Scanner;

public class ScannerEx {// java.lang
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// ctrl+shift+O
		System.out.println("Enter emp ID:");
		int empId = scan.nextInt();
		System.out.println(empId);
	}
}
