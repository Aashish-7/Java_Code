package javaoop;

class Test4 {
	int i;

	void setValue(int i) {
		this.i = i;
	}

	void show() {
		System.out.println(i);
	}
}

public class ThisDemo {
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.setValue(10);
		t.show();
	}
}
