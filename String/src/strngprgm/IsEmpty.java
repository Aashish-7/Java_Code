package strngprgm;

public class IsEmpty {
	public static void main(String[] args) {
		String name = "abcd";
		String email = "abcd@gmail.com";
		String pass = "abcd123";

		System.out.println(name.isEmpty());// return boolean value if true means empty string print any statement
		if (name.isEmpty() == true) {
			System.out.println("name is empty");
		} else {
			System.out.println("name add");
		}
	}
}
// same for pass and email check ......