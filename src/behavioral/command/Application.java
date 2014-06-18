package behavioral.command;

public class Application {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		waiter.placeOrder(new CoffeeOrder(new Chef()));

	}

}
