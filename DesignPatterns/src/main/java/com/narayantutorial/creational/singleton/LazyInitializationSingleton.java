package com.narayantutorial.creational.singleton;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton obj;
	
	private LazyInitializationSingleton() {
		
	}
	
	public static LazyInitializationSingleton getLazyInitializationSingleton() {
		if(obj ==null) {
			synchronized (LazyInitializationSingleton.class) {
				if(obj==null) {
					obj=new LazyInitializationSingleton();
				}
			}
		}
		return obj;
	}
	
	public void doSomething() {
		//doSomething
	}
}
