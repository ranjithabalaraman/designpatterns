package creational.singleton;

/**
 * To overcome the issue with Reflection, Joshua Bloch suggests the use of Enum.
 * Java ensures that any enum value is instantiated only once in a Java program.
 * Since Java Enum values are globally accessible, so is the singleton. The
 * drawback is that it does not allow lazy initialization.
 */
public enum EnumSingleton {
	INSTANCE;

	public static void doSomething() {
	}
}
