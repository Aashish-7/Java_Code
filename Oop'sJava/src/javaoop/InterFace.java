package javaoop;

interface I1 {
	void show();
}

public class InterFace implements I1 {
	public void show() {
		System.out.println("1....");
	}

	public static void main(String[] args) {
		InterFace i = new InterFace();
		i.show();

	}
}
