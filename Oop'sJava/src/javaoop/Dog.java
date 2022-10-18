package javaoop;

class Animal4 {
	void eat() {
		System.out.println("I am eating..");
	}
}

class Dog extends Animal4 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}

}
