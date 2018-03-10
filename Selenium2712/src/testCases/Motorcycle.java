package testCases;

public class Motorcycle  implements Movable{
	@Override
	public void move(int distance) {
		System.out.println("Motorcycle is moving mile:"+distance);
	}
}
