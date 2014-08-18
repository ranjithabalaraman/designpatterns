package creational.singleton;

/**
 * Class Singleton is an implementation of a class that only allows one
 * instantiation.
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	/**
	 * provides thread-safety but it reduces the performance because of
	 * synchronized method, although we need it only for the first few threads
	 * who might create the separate instances
	 * 
	 * @return
	 */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	/**
	 * synchronized block is used inside the if condition with an additional check
	 * to ensure that only one instance of singleton class is created.
	 * @return
	 */
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
