package stringpack;

public class StringBuilderExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sd = new StringBuffer("Aajibabu"); 
		StringBuffer sd1 = new StringBuffer("Dhangar"); 
		System.out.println("Addind string sb1 to the end of string sb: " + sd.append(" bobby"));
		System.out.println("Char at index 8: " + sd.charAt(8));
		System.out.println("Length of string: " + sd.length());
		System.out.println("String: " + sd);
		System.out.println("Substring of string: " + sd.substring(0, 5));
		System.out.println("Deleting string: " + sd1.delete(5,7));		
		System.out.println("Reverse of string: " + sd.reverse());

	}

}
