package strngprgm;

public class SerachingMethods {
	public static void main(String[] args) {
		String s = "Aashish";

		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf("sh"));
		System.out.println(s.indexOf('s', 4));// ????
		System.out.println(s.indexOf("as", 7));// ???

		System.out.println(s.lastIndexOf('h'));
		System.out.println(s.lastIndexOf("sh"));
		System.out.println(s.lastIndexOf('h', 5)); // ???

		System.out.println(s.charAt(6));

		System.out.println(s.contains("a"));

		System.out.println(s.startsWith("A"));

		System.out.println(s.endsWith("h"));

	}

}
