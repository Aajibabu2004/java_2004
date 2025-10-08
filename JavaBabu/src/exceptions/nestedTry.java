package exception;

public class nestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String s = null;
				System.out.println(s.length());
			} catch(Exception e) {
				System.out.println("Null values are not readable");
			} finally {
				System.out.println("Inner finally block");
			}
		} 
		catch(Exception e) {
			System.out.println("Null values are not readable");
		}
		finally {
			System.out.println("Outer finally block");
		}
	}

}
