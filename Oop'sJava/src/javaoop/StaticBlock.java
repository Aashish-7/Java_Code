package javaoop;

public class StaticBlock {
	static {
		System.out.println("HELLO!!");
	}

	public static void main(String[] args) {

		System.out.println(" i am in main method");
	}
}

// static block execute automatically when the class is loading in the memory 