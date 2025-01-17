
package com.ashishrai.design_patterns.creational.singleton;

public class HolderSingleton {

	private HolderSingleton() {

		// Private constructor to prevent instantiation
	}

	private static class Holder {

		private static final HolderSingleton INSTANCE = new HolderSingleton();
	}

	public static HolderSingleton getInstance() {

		return Holder.INSTANCE;
	}
}
