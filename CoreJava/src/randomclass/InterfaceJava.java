interface InterfaceJava {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

class janwars implements InterfaceJava {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Main1 {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}