package testCases;

public class Bike implements Movable{
	@Override
	public void move(int distance) {
		System.out.println("Bike is movin mile:"+distance);
	}
}
