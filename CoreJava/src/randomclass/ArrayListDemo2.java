package collectionjavayt;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList al3 = new ArrayList();
		 al3.add(100);
		 al3.add(200);
		 al3.add(300);
		 
		 ArrayList al4 = new ArrayList();
		 al4.add(100);
		 al4.add(500);
		 al4.add(600);
		 
		 al3.removeAll(al4);
		 System.out.println(al3);
	}
}
