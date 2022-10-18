package com.coforge;

public class CountNumber {

	// Function to count total number of words in the string
	
	public static int countWords(String str) {

		
		if (str == null || str.isEmpty())
			return 0;

		String[] words = str.split("\\s+");
 
		return words.length;
	}

	public static void main(String args[]) {

		
		String str = "We are doing a 5 weeks training in coforge";

		// Print the result
		System.out.println("No of words : " + countWords(str));
	}

}
