package com.coforge.collections;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> al = new Vector<String>();//double the size

		al.add("suresh");
		al.add("naresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("suresh");
		System.out.println(al.capacity());
		al.add("mukesh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("suresh");
		System.out.println(al.capacity());
		System.out.println(al);
	}
}
