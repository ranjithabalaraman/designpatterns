package structural.bridge;

public class Application {

	public static void main(String[] args) {
		Switch[] switches = new Switch[] { new ConcreteSwitch(new Fan()),
				new ConcreteSwitch(new Light()), };
		for (Switch sw : switches) {
			sw.on();
		}
	}
}
