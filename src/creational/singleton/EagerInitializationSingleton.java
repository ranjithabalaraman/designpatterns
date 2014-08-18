package creational.singleton;

/**
 * Class Singleton is an implementation of a class that only allows one
 * instantiation.
 */
public class EagerInitializationSingleton {

	// The private reference to the one and only instance.
	// Eager instantiation.
	private static EagerInitializationSingleton uniqueInstance = new EagerInitializationSingleton();

	// An instance attribute.
	private int data = 0;

	/**
	 * Returns a reference to the single instance.
	 */
	public static EagerInitializationSingleton instance() {
		return uniqueInstance;
	}

	/**
	 * The Singleton Constructor. Note that it is private! No client can
	 * instantiate a Singleton object!
	 */
	private EagerInitializationSingleton() {
	}
}
