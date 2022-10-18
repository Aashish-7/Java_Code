package collectionjavayt;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class ListDemo {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add(1, 20);
		System.out.println(l);
		  //l.add(3,30);  // error because follow insertion order 
		
		l.add(null);
		l.add(null);
		System.out.println(l); // use multiple null
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		ListIterator ltr1 = l.listIterator();
		while(ltr1.hasPrevious()) {
			System.out.println(ltr1.previous());
		}
	}

}
