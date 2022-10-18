class Animals {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pigs extends Animals {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dogs extends Animals {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Polymorphism {
	public static void main(String[] args) {
		Animals myAnimal = new Animals(); // Create a Animal object
		Animals myPig = new Pigs(); // Create a Pig object
		Animals myDog = new Dogs(); // Create a Dog object
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
