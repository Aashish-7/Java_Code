class InheritanceJava {
	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

class Car extends InheritanceJava {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		Car myFastCar = new Car();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
}
