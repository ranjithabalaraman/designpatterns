package structural.bridge;

public class Light implements Equipment {

	@Override
	public void start() {
		System.out.println("Turning on light..");
	}

}
