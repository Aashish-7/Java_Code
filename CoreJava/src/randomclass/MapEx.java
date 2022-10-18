package com.coforge.collections;

import java.util.TreeMap;

//insertion order is not preserved 
public class MapEx {
public static void main(String[] args) {
	TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
					hm.put(54,"pintu");
					hm.put(4,"abhishek");
					hm.put(894,"suresh");
					hm.put(123,"mahesh");
					hm.put(234,"taniya");
					hm.put(89,"ibna");
					hm.put(894,"rajesh");
					
				System.out.println(hm);	
					
}
}
