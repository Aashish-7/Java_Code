package com.coforge.stringex;

public class StringEx {

	public static void main(String[] args) {
		String name = "coforge";//98

		String name1 = "Coforge";//65   33

		System.out.println(name == name1);//objects are referring same memory or not 

		System.out.println(name.equals(name1));//String.equals will both the object values are same ot not
		
		System.out.println(name.compareTo(name1));//
		
		//returns -ve if obj1 has to come before obj2
		
		//returns +ve if obj1 has to come after obj2
		
		//returns 0 if both are same
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name.compareToIgnoreCase(name1));
		
		String a=new String("coforge");
		String b=new String("coforge");
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		StringBuilder sb=new StringBuilder("coforge");
		StringBuilder sb1=new StringBuilder("coforge");
	//	sb.append(" india");
		System.out.println(sb);//

		System.out.println(sb.equals(sb1));//false   Object -11 ==
		System.out.println(sb==sb1);//false
		
		System.out.println(sb.toString().equals(sb1.toString()));
	}

}
