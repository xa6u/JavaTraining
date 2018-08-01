
public class Car {
	public void start() {
		System.out.println("Врум, врум!!!");
	}
	public void stop() {
		System.out.println("Двигатель остановлен.");
	}
	public int drive(int howlong) {
		int distance = 0;
		distance = howlong*60;
		return distance;
	}
}
