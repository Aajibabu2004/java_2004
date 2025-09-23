package Interface;
public class RealWorldExp {

	public static void main(String[] args) {
		Payments c = new CreditCard();
		Payments u = new UPI();
 		
 		c.pay(5000);
 		u.pay(10000);
 		
 		System.out.println();
 		
 		Vehicle c1 = new Car();
 		Vehicle b1 = new Bike();
 		
 		c1.start();
 		c1.stop();
 		
 		b1.start();
 		b1.stop();
 		
 		System.out.println();
 		
 		Phone n = new Nokia();
 		Phone s = new Samsung();
 		
 		n.showMsg();
 		n.IncomingCall();
 		
 		s.showMsg();
 		s.IncomingCall();
 		
	}

}