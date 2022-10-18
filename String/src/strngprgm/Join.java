package strngprgm;

public class Join {
	public static void main(String[] args) {
		String s1 = "Aashish";
		String s2 = "Kumar";
		String s3 = "Prajapati";

		System.out.println(String.join(";", s1, s2, s3));
	}

}
// support vararg... and it is call by the class name because it is a static methods 