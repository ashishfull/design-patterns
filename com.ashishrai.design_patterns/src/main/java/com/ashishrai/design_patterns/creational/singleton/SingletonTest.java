
package com.ashishrai.design_patterns.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {

		testDoubleCheckedEmployee();
		testHolderSingleton();
		testEnumSingleton();
	}

	private static void testDoubleCheckedEmployee() {

		System.out.println("Testing DoubleCheckedEmployee Singleton:");
		DoubleCheckedEmployee instance1 = DoubleCheckedEmployee.getInstance();
		DoubleCheckedEmployee instance2 = DoubleCheckedEmployee.getInstance();
		System.out.println("Are both instances same? " + (instance1 == instance2));
		System.out.println("Instance 1 HashCode: " + instance1.hashCode());
		System.out.println("Instance 2 HashCode: " + instance2.hashCode());
		System.out.println("----------------------------------------");
	}

	private static void testHolderSingleton() {

		System.out.println("Testing HolderSingleton Singleton:");
		HolderSingleton instance1 = HolderSingleton.getInstance();
		HolderSingleton instance2 = HolderSingleton.getInstance();
		System.out.println("Are both instances same? " + (instance1 == instance2));
		System.out.println("Instance 1 HashCode: " + instance1.hashCode());
		System.out.println("Instance 2 HashCode: " + instance2.hashCode());
		System.out.println("----------------------------------------");
	}

	private static void testEnumSingleton() {

		System.out.println("Testing EnumSingleton Singleton:");
		EnumSingleton instance1 = EnumSingleton.INSTANCE;
		EnumSingleton instance2 = EnumSingleton.INSTANCE;
		System.out.println("Are both instances same? " + (instance1 == instance2));
		System.out.println("Instance 1 HashCode: " + instance1.hashCode());
		System.out.println("Instance 2 HashCode: " + instance2.hashCode());
		instance1.doSomething(); // Testing functionality
		System.out.println("----------------------------------------");
	}
}
