package com.coforge;

public class SecondOccurrence {

	public static void main(String[] args)

	{

		String string1 = "bvrit college";

		char ch[] = string1.toLowerCase().toCharArray();

		// second letter of every word is capitalized

		for (int i = 0; i < ch.length; i++)

		{	

			ch[0] = Character.toUpperCase(ch[0]);

			if (Character.isWhitespace(ch[i]) && Character.isLetter(ch[i + 1]))

				ch[i + 2] = Character.toUpperCase(ch[i + 2]);

		}

		String str = new String(ch);

		System.out.println(str);

	}

}
