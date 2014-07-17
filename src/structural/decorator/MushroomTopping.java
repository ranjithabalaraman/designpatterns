package structural.decorator;

public class MushroomTopping extends ToppingsDecorator {

	public MushroomTopping(BasicPizza pizza) {
		super(pizza);
		this.price = 1.49;
	}

}
