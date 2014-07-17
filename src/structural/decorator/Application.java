package structural.decorator;

public class Application {

	public static void main(String[] args) {

		BasicPizza basicPizza = new BasicPizza();
		System.out
				.println("Base added; Price to pay: " + basicPizza.getPrice());

		MushroomTopping mushroomTopping = new MushroomTopping(basicPizza);
		System.out.println("Mushroom topping added; Price to pay: "
				+ mushroomTopping.getPrice());

		JalapenoTopping jalapenoTopping = new JalapenoTopping(mushroomTopping);
		System.out.println("Jalapeno topping added; Price to pay: "
				+ jalapenoTopping.getPrice());
	}

}
