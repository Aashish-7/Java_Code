package javaoop;

public class Animal {

	void eat() {
		System.out.println("I am eating..");
	}

	public static void main(String[] args) {
		System.out.println("1");
		Animal am = new Animal();
		am.eat();
		am.run();
		Birds br = new Birds();
		br.fly();

	}

	public void run() {
		System.out.println("I am running..");
	}

}

class Birds {
	void fly() {
		System.out.println("I am flying..");
	}
}