package stringpack;

public class stringMetd {

	public static void main(String[] args) {
		String fname="Mahindra Singh";
		String lname="Dhoni";
		System.out.println(fname.length());
		System.out.println(lname.length());

		System.out.println(fname.charAt(3));
		System.out.println(fname.charAt(13));
		String st = new String("Hello");  // 1st way to create
		String st1 = "    Hi";           // 2nd way to create
		System.out.println("Length of String(Hello): " + st.length());
		System.out.println("Char at index 0: " + st.charAt(0));
		System.out.println("Comparing 2 strings: " + st.compareTo("Hello"));
		System.out.println("Combaining 2 strings: " + st.concat(", aajibabu"));
		System.out.println("Does the string conatain 'll': " + st.contains("ll"));
		System.out.println("Does st is equal to st1: " + st.equals(st1));
		System.out.println("String in uppercase: " + st.toUpperCase());
		System.out.println("String in lowercase: " + st.toLowerCase());
		System.out.println("Replacing 'l' by 'r' in the string: " + st.replace("l","r"));
		System.out.println("removing white spaces in st1: " + st1.trim());
		String text = "Java is fun";
		String[] words = text.split(" ");
		for(String w : words) {
		    System.out.println(w);
		}
	}

}
