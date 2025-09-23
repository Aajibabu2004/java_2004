package Interface;
interface Payments{
	void pay(double price);
}

class CreditCard implements Payments{
	public void pay(double price) {
		System.out.println("Amount: "+price+" Rs. Paid By Credit Card");
	}
}

class UPI implements Payments{
	public void pay(double price) {
		System.out.println("Amount: "+price+" Rs. Paid By UPI");
	}
}