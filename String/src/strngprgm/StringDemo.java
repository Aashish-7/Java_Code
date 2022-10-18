package strngprgm;

public class StringDemo {

	public static void main(String[] args) {

		char[] c = { 'a', 'b', 'c' };
		String s = new String("abc");
		System.out.println(c);
		System.out.println(s);

		String s1 = new String("Aashish"); // 2 obj (1 heap area and one is string constant pool)
		String s2 = new String("Aashish");
		System.out.println(s1 == s2); // == use for address and reference component
		System.out.println(s1.equals(s2)); // only compare content information

		String s3 = "Aashish"; // 1 obj only in SCP
		String s4 = "Aashish";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
