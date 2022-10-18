package com.coforge;

public class CharIndex {

	public static void main(String[] args)
    {
        String str = "Coforge Training";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(8);

        // Print out the results.
        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 8 is " +
            (char)index2);
    }
}
