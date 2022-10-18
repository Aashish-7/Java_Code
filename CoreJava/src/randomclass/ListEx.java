package com.coforge.collections;

import java.util.ArrayList;

//growable in nature   java.util
//homogeneous & haterogeneous
//predefiend
//duplicates are allowed
//insertion order 
public class ListEx {
	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();// 10 (cc*3/2)+1

		al1.add("ibna");
		al1.add("sandeep");
		al1.add("abhishek");
		al1.add("shayid");
		al1.add("akash");
		al1.remove("akash");
		System.out.println(al1);
		
		ArrayList<String> al = new ArrayList<String>();// 10 (cc*3/2)+1

		al.add("suresh");
		al.add("naresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("suresh");
		al.add("mukesh");
		System.out.println(al);
		al.addAll(al1);
		System.out.println(al);
		al.retainAll(al1);
		System.out.println(al);

	}
}
