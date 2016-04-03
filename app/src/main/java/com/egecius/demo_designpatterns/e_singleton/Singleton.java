package com.egecius.demo_designpatterns.e_singleton;

public class Singleton {

	/**
	 * ‘volatile’ ensures that multiple threads handle the instance correctly when it is being
	 * initialized to a Singleton instance.
	 */
	private volatile static Singleton singletonInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singletonInstance == null)
			synchronized (Singleton.class) {
				/** 2nd check in case another thread has create an object after our 1st check */
				if (singletonInstance == null) {
					singletonInstance = new Singleton();
				}
			}
		return singletonInstance;
	}
}
