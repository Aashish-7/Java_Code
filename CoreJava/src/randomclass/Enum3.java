enum Levelss {
	LOW, MEDIUM, HIGH
}

public class Enum3 {
	public static void main(String[] args) {
		for (Levelss myVar : Levelss.values()) {
			System.out.println(myVar);
		}
	}
}
