package strngprgm;

public class ConversionString {
	public static void main(String[] args) {
		String s = "aasiHIsh";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		int a = 10  ; int b = 20;
		String s1 = String.valueOf('a');
		String s2 = String.valueOf('b');
		System.out.println(s1+b);
		System.out.println(a+b);
		
		char[] c = s.toCharArray();
		System.out.println(c);
	}

}
;