package javaoop;

public class OverLoad {

	void show() {
		System.out.println("1..");
	}

	void show(int a) {
		System.out.println("2..");
	}

	public static void main(String[] args) {
		OverLoad ol = new OverLoad();
		ol.show();
		ol.show(100);
	}

}
