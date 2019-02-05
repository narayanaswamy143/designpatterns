package com.narayantutorial.creational.singleton;

public class SingletonDeserialize {
	
private static SingletonDeserialize obj;
	
	private SingletonDeserialize() {
		
	}
	
	public static SingletonDeserialize getSingletonDeserialize() {
		if(obj ==null) {
			synchronized (SingletonDeserialize.class) {
				if(obj==null) {
					obj=new SingletonDeserialize();
				}
			}
		}
		return obj;
	}
	
	//Deserialize from serialize
	
	protected Object readResolve() {
		return getSingletonDeserialize();
	}
	
	
	public void doSomething() {
		//doSomething
	}

}
