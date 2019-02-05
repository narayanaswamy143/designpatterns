package com.narayantutorial.creational.singleton;

public class EarlyInitializationSingleton {
	
	private static EarlyInitializationSingleton obj =new EarlyInitializationSingleton();
	private EarlyInitializationSingleton() {
		
	}
	
	public static EarlyInitializationSingleton getEarlyInitializationSingleton() {
		return obj;
	}

	public void doSomething() {
		//doSomething
	}
}
