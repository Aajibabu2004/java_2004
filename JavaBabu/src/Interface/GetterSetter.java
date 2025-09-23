package Interface;

class Private {
	private int val = 40;

	void get() {
		System.out.println("Value : " + val);
	}

	void set(int k) {
		val = k;
	}
}

public class GetterSetter {

	public static void main(String[] args) {
		Private p = new Private();
//		System.out.println("The Private Value is : " + p.val); // Provides Error
		p.get();
		p.set(60);
		p.get();

	}

}