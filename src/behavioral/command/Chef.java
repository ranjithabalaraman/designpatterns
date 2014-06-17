package behavioral.command;

public class Chef {

	public Food prepareOrder(Order order) {
		Food food = getCookedFood(order);
		return food;
	}

	public Food getCookedFood(Order order) {
		Food food = new Food(order);
		System.out.println("Food is ready! " + food);
		return food;
	}
}
