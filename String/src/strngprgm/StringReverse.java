package strngprgm;

// both in one program that is reverse and palindrom !!
public class StringReverse {
	public static void main(String[] args) {
		String s = "Mam";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("Not a palindrom String");
		}

	}

}
