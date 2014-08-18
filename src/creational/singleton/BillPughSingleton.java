package creational.singleton;

/**
 * Prior to Java 5, java memory model had a lot of issues. Singleton approaches
 * used to fail in certain scenarios where too many threads try to get the
 * instance of the Singleton class simultaneously.
 */
public class BillPughSingleton {

	private BillPughSingleton() {
	}

	/*
	 * Private inner static class contains the instance of the singleton class.
	 * When the singleton class is loaded, SingletonHelper class is not loaded
	 * into memory Only when someone calls the getInstance method, this class
	 * gets loaded and creates the Singleton class instance.
	 * Synchronization is not required
	 */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
