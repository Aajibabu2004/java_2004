package Interface;
interface Shape{
	int value = 0;
	void area();
}

class Circle implements Shape{ 
	double r;
	static double pi = 3.14;

	Circle(double r){
		this.r = r;
	}
	public void area() {
		double area =  pi * this.r * this.r;
		System.out.println("The Area Of Circle : "+area);
	}
	
}

class Rectangle implements Shape{ 
	double l,b;

	Rectangle(double l , double b){
		this.l = l;
		this.b = b;
	}
	public void area() {
		double area =  this.l * this.b;
		System.out.println("The Area Of Rectangle : "+area);
	}
	
}

public class InterfacePrac {
	public static void main(String args[]) {
		Shape c = new Circle(5.0);
		System.out.println("The Default Value : "+c.value); // Interface Value Accessing
		c.area();
		
		Shape r = new Rectangle(3,2);
		System.out.println("The Default Value : "+r.value); // Interface Value Accessing
		r.area();
	}
}