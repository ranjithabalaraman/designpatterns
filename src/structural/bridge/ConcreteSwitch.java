package structural.bridge;

public class ConcreteSwitch extends Switch {

	protected ConcreteSwitch(Equipment equipment) {
		super(equipment);
	}

	@Override
	public void on() {
		equipment.start();
	}
}
