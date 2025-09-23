package Interface;
interface Vehicle{
	void start();
	void stop();
}
class Car implements Vehicle {
	public void start() {
		System.out.println("The Car Engine is Started...");
	}
	
	public void stop() {
		System.out.println("The Car Engine is Stopped...");
	}
}

class Bike implements Vehicle {
	public void start() {
		System.out.println("The Bike Engine is Started...");
	}
	
	public void stop() {
		System.out.println("The Bike Engine is Stopped...");
	}
}