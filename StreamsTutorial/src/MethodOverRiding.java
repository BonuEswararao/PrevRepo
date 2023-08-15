
public class MethodOverRiding extends Vehicle{
	
	void run() {
		System.out.println("Bike is Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding riding = new MethodOverRiding();
		riding.run();
	}

}


 class Vehicle{
	void run() {
		System.out.println("Vehicle is Running");
	}
}
