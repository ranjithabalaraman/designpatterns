package creational.factorymethod;

public class Rupee implements Currency {
	@Override
	public String getSymbol() {
		return "Rs";
	}
}