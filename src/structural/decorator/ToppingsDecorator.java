package structural.decorator;

public abstract class ToppingsDecorator extends BasicPizza {

	protected BasicPizza pizza;

	public ToppingsDecorator(BasicPizza pizzaToDecorate) {
		this.pizza = pizzaToDecorate;
	}

	@Override
	public double getPrice() {
		return this.pizza.getPrice() + this.price;
	}

}
