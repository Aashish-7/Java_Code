package strngprgm;

public class CompareTo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "aC"; // if first is zero then move to the next item

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
