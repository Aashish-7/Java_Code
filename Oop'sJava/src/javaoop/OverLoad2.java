package javaoop;

public class OverLoad2 {

	public static void main(String[] args) {
		System.out.println("1..");
		OverLoad2 ol = new OverLoad2();
		ol.main(11);
	}

	public void main(int a) {
		System.out.println("2");
	}

}
