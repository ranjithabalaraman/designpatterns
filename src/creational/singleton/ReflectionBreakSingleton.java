package creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton {

	public static void main(String[] args) {
		EagerInitializationSingleton instanceOne = EagerInitializationSingleton
				.instance();
		EagerInitializationSingleton instanceTwo = null;
		try {
			@SuppressWarnings("rawtypes")
			Constructor[] constructors = EagerInitializationSingleton.class
					.getDeclaredConstructors();
			for (@SuppressWarnings("rawtypes") Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializationSingleton) constructor
						.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
