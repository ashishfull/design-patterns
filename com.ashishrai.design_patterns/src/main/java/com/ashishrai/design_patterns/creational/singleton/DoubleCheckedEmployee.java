
package com.ashishrai.design_patterns.creational.singleton;

public class DoubleCheckedEmployee {

	private static volatile DoubleCheckedEmployee instance;

	private DoubleCheckedEmployee() {

		// Private constructor to prevent instantiation
	}

	public static DoubleCheckedEmployee getInstance() {

		if (instance == null) { // First check (no locking)
			synchronized (DoubleCheckedEmployee.class) {
				if (instance == null) { // Second check (with locking)
					instance = new DoubleCheckedEmployee();
				}
			}
		}
		return instance;
	}
}
