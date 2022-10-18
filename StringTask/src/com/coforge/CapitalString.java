package com.coforge;

public class CapitalString {

	public static void main(String[] args) {
		String str = "Welcome To Coforge Noida";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
	}

}
