 // static	Attributes and methods belongs to the class, rather than an object
// A static method means that it can be accessed without creating an object of the class, unlike public:


public class ModifierStatic {
	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	// Main method
	public static void main(String[] args) {
		myStaticMethod(); // Call the static method
		// myPublicMethod(); This would output an error

		ModifierStatic myObj = new ModifierStatic(); // Create an object of Main
		myObj.myPublicMethod(); // Call the public method
	}
}