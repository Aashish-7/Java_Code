package javaoop;

public class OverLoad4 {

	void show(StringBuffer a) {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		OverLoad4 ol = new OverLoad4();
		ol.show(null);
		ol.show(new StringBuffer("abc"));
	}

}
