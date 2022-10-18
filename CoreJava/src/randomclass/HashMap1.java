import java.util.HashMap;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String,String> CapitalCities = new HashMap<String,String>();
		CapitalCities.put("England", "London");
		CapitalCities.put("India", "New Delhi");
		CapitalCities.put("Germany", "Berlin");
		CapitalCities.put("Norway", "Oslo");
		
		System.out.println(CapitalCities);
	}
}
