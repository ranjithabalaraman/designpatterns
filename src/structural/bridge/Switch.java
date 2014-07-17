package structural.bridge;

public abstract class Switch {

	protected Equipment equipment;

	protected Switch(Equipment equipment) {
		this.equipment = equipment;
	}

	public abstract void on();
}
