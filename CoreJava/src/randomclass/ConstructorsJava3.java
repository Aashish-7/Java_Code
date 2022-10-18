///You can have as many parameters as you want:
public class ConstructorsJava3 {
	int modelYear;
	String modelName;

	public ConstructorsJava3(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		ConstructorsJava3 myCar = new ConstructorsJava3(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
}

// Outputs 1969 Mustang  