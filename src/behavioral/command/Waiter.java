package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Order> orderList = new ArrayList<Order>();

	@SuppressWarnings("rawtypes")
	public List getCommandList() {
		return orderList;
	}

	public void placeOrder(Order order) {
		this.orderList.add(order);
		order.execute();
	}
}
