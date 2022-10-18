package javaoop;

public class OverLoad3 { // automatic promotion char to int .........

	void show(int a) {
		System.out.println("int method!!");
	}

	void show(String a) {
		System.out.println("String method!! ");
	}

	public static void main(String[] args) {
		OverLoad3 ol = new OverLoad3();
		ol.show('a');
	}

}
 