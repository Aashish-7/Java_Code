package collectionjavayt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add("Aashish");
		
		System.out.println(s);  // no order of insertion matter in output
		
		s.add(300);
		System.out.println(s); // multiple value can't store
		
		s.add(null);
		s.add(null);
		System.out.println(s); // only store one null value because of duplicasy
		
		Iterator li = s.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
