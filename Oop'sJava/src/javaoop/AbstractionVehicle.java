package javaoop;

abstract class Vehicle {
	int no_of_tyres;

	abstract void start();
}

class Car extends Vehicle {
	void start() {
		System.out.println("Start with key..");
	}
}

class Scooter extends Vehicle {
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Start with kick..");
	}
}

public class AbstractionVehicle {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("no of tyres in car: " + (c.no_of_tyres = 4));
		c.start();

		Scooter s = new Scooter();
		System.out.println("no of tyres in scooter: " + (s.no_of_tyres = 2));
		s.start();
	}
}
