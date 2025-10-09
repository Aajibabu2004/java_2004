package collections;


	import java.util.LinkedHashMap;

	public class linkedhashmap {
	  public static void main(String[] args) {
	    LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

	    capitalCities.put("England", "London");
	    capitalCities.put("India", "New Dehli");
	    capitalCities.put("Austria", "Wien");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Norway", "Oslo"); // Duplicate
	    capitalCities.put("USA", "Washington DC");

	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("England"));
	    
	    capitalCities.remove("England");
	    System.out.println(capitalCities); 
	  }
}
