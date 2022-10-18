package com.coforge.collections;

import java.util.TreeSet;
//growable in nature   java.util
//homogeneous & haterogeneous
//predefiend
//duplicates are not allowed
//insertion order not followed

public class SetEx {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();// 16 sorting order
		set.add("mukesh");
		set.add("suresh");//compareTo
		set.add("akash");
		set.add("mahesh");
		set.add("rajesh");
		set.add("suresh");
		set.add("naresh");
		System.out.println(set);
	}
}
