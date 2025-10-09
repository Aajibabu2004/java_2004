package collections;


	import java.util.LinkedHashSet;
	public class linkedhashset {
	  public static void main(String[] args) {
	    LinkedHashSet<String> cars = new LinkedHashSet<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");  // Duplicate
	    cars.add("Mazda");

	    System.out.println(cars);
	    System.out.println(cars.contains("Mazda"));
	    
	    cars.remove("Volvo");
	    System.out.println(cars);
	    System.out.println(cars.size());
	    for (String car : cars) {
	    	  System.out.println(car);
	    	}
	  }
	}
