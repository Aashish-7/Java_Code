package controlstmt;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No for print table.");
		int t = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			// System.out.println(t*i);
			System.out.println(t + "X" + i + "=" + t * i);
		}
	}

}
