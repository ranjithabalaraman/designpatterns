package behavioral.command;

public class Client {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		waiter.placeOrder(new CoffeeOrder(new Chef()));

	}

}
