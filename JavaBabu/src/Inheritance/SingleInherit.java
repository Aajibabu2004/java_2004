package Inheritance;

class Base{
	public void method1() {
		System.out.println("This is Method 1");
	}
}

class Child extends Base{
	public void method2() {
		System.out.println("This is Method 2");
	}
}

public class SingleInherit {

	public static void main(String[] args) {
		Child aaji = new Child();
		
		aaji.method1();
		aaji.method2();

	}

}
