package controlstmt;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string for reverse.");
		String name = sc.next();
		int leng = name.length();
		String rev = "";
		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

}
