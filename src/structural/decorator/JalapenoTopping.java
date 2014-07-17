package structural.decorator;

public class JalapenoTopping extends ToppingsDecorator {

	public JalapenoTopping(BasicPizza pizza) {
		super(pizza);
		this.price = 1.49;
	}

}
