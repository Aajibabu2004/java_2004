package collections;


	import java.util.HashMap;

public class hashmap {
	  public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
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
	    

	    System.out.println(capitalCities.size());
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println(i);
	    	// Print values
	    	  for (String i1 : capitalCities.values()) {
	    	    System.out.println(i1);
	    	  }
	    	}
	  }
	}

