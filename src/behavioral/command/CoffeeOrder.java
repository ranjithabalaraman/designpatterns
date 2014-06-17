package behavioral.command;

public class CoffeeOrder implements Order {

	private Chef chef;

	public CoffeeOrder(Chef chef) {
		this.setChef(chef);
	}

	@Override
	public void execute() {
		chef.prepareOrder(this);
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

}
