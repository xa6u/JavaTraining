
public class CarOwner {

	public static void main(String[] args) {
		
		int distance;
		
		Car myCar = new Car();
		myCar.start();
		distance = myCar.drive(20);
		System.out.println("Моя машина проехала "+distance+" километров!!");
		myCar.stop();
	}

}
