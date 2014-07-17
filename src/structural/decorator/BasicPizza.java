package structural.decorator;

public class BasicPizza implements Pizza {

	protected double price = 6.99;

	@Override
	public double getPrice() {
		return price;
	}

}
