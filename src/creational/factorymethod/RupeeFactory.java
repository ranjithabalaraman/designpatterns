package creational.factorymethod;

public class RupeeFactory implements CurrencyFactory {

	@Override
	public Currency createCurrency() {
		return new Rupee();
	}

}
