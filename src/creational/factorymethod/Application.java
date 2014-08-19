package creational.factorymethod;

public class Application {
	public static void main(String args[]) {
		CurrencyFactory factory = new RupeeFactory();
		Currency rupee = factory.createCurrency();
		System.out.println(rupee.getSymbol());
	}
}
