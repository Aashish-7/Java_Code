package strngprgm;

public class ConstructorS {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Aashish");
		String s2 = new String(sb);
		System.out.println(s2);

		StringBuilder sb1 = new StringBuilder("Aashish");
		String s1 = new String(sb1);
		System.out.println(s1);

		String s3 = new String();
		System.out.println(s3.length());

		byte[] b = { 101, 102, 103 }; // convert byte into character
		String s4 = new String(b);
		System.out.println(s4);

		char[] c = { 'a', 'b', 'c' };
		String s5 = new String(c);
		System.out.println(s5);

	}

};
