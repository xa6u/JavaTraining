
public class CarOwner {

	public static void main(String[] args) {
		
		int distance;
		int time=20;
		
		Car myCar = new Car();
		myCar.start();
		distance = myCar.drive(time);
		System.out.println("Моя машина проехала "+distance+" километров за "+time+" часов");
		myCar.stop();
		
		JamesBondCar jbCar = new JamesBondCar();
		jbCar.start();
		distance = jbCar.drive(time);
		System.out.println("Машина 007 проехала "+distance+" километров за "+time+" часов");
		jbCar.stop();
		
	}

}
