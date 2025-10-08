package stringpack;

public class StringBufferExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Aajibabu"); 
		StringBuffer sb1 = new StringBuffer("Dhangar"); 
		System.out.println("Addind string sb1 to the end of string sb: " + sb.append(" bob"));
		System.out.println("Char at index 8: " + sb.charAt(8));
		System.out.println("Length of string: " + sb.length());
		System.out.println("String: " + sb);
		System.out.println("Substring of string: " + sb.substring(0, 5));
		System.out.println("Deleting string: " + sb1.delete(5,7));		
		System.out.println("Reverse of string: " + sb.reverse());

	}

}
