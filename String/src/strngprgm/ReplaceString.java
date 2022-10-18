package strngprgm;

public class ReplaceString {
	public static void main(String[] args) {
		String s = "this is demo";

		System.out.println(s.replace("is", "was"));
		System.out.println(s.replaceFirst("is", "was"));
		System.out.println(s.replaceAll("is(.)", "was"));// remove space and replace all is to was
		System.out.println(s.replaceAll("is(.*)", "was"));// remove all after change first is into was
		System.out.println(s.replace(s, null)); // tafri
	}

}
