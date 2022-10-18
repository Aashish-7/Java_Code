package strngprgm;

public class Length {
	public static void main(String[] args) {
		// String name = null; // NullPointerException occur if null is pas in string
		String name = "abc";
		String email = "abc@gmail.com";
		String pass = "abc123";

		System.out.print(name.length() + " ");
		int i = name.length();
		if (i == 0) {
			System.out.println("name can not be empty");
		} else {
			System.out.println("seccsefully add");
		}
		System.out.println(email.length());
		System.out.println(pass.length());
	}
// check pass and email length if it is equal to the zero then directly print can't be empty
}
