package creational.builder;

/* A customer ordering a pizza. */
public class Application {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();

		Pizza pizza1 = waiter.getPizza();
		
		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();

		Pizza pizza2 = waiter.getPizza();
	}
}
