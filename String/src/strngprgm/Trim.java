package strngprgm;

public class Trim { // trim() return string value...
	public static void main(String[] args) {
		String name = "    aashish kumar   ";
		String email = "code with";
		String pass = "aashu123";

		String s = name.trim(); // remove start and last space
		System.out.println(s);

		// we can use like that
		if (name.trim().length() == 0) { // firstly remove spaces and then check length
			System.out.println("Empty");
		} else {
			System.out.println("Add");
		}
	}

}
