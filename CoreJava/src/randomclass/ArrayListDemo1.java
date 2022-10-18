package collectionjavayt;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);

		System.out.println(al1);

		ArrayList al2 = new ArrayList();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");

		System.out.println(al2);

		al1.addAll(al2);
		System.out.println(al1);
	}

}
