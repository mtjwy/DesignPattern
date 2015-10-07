package com.mtjwy.Singleton;

public class Singleton1 {
	private static Singleton1 singleInstance;
	
	private Singleton1() {
		
	}
	
	public static synchronized Singleton1 getInstance() {
		if (singleInstance == null) {
			singleInstance = new Singleton1();
		}
		return singleInstance;
	}
}
