package collections;


	import java.util.TreeMap;

	public class treemap {
	  public static void main(String[] args) {
	    TreeMap<String, String> capitalCities = new TreeMap<>();
	    capitalCities.put("England", "London");
	    capitalCities.put("India", "New Dehli");
	    capitalCities.put("Austria", "Wien");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Norway", "Oslo"); // Duplicate
	    capitalCities.put("USA", "Washington DC");

	    System.out.println(capitalCities);

	    System.out.println(capitalCities.get("England"));
	    
	 // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	  }
}
