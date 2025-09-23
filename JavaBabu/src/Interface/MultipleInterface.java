package Interface;
interface Base1{
	int val1 = 10;
	void show1();
}
interface Base2 extends Base1{
	int val2 = 20;
	void show2();
}

class Interf implements Base2{
	
	public void show1() {
		System.out.println("This is Show 1 Method");
	}
	public void show2() {
		System.out.println("This is Show 2 Method");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		
		Base2 i = new Interf();
		System.out.println("The Value Of Base 1 : "+i.val1);
		System.out.println("The Value Of Base 2 : "+i.val2);
		
		i.show1();
		i.show2();
		

	}

}
