package creational.singleton;

/**
 * Class Singleton is an implementation of a class that only allows one
 * instantiation.
 */
public class StaticBlockInitializationSingleton {

	private static final StaticBlockInitializationSingleton instance;

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockInitializationSingleton();
		} catch (Exception e) {
			throw new RuntimeException("an error occurred!", e);
		}
	}

	public static StaticBlockInitializationSingleton getInstance() {
		return instance;
	}

	private StaticBlockInitializationSingleton() {
	}
}
