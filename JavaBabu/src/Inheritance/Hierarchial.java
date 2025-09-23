package Inheritance;


class GrandFather{
	public void property() {
		System.out.println("Grand Father Property");
	}
}

class Father extends GrandFather{
	public void property2() {
		System.out.println("Father Property");
	}
}

class Child1 extends GrandFather{
	public void property3() {
		System.out.println("Child Property");
	}
}

public class Hierarchial {

	public static void main(String[] args) {
		Father f = new Father();
		Child1 c = new Child1();
		
		f.property();
		f.property2();
		
		System.out.println();
		
		c.property();
		c.property3();
		
	}

}
