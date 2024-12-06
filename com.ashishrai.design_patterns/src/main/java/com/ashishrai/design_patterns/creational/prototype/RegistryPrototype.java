
package com.ashishrai.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegistryPrototype {

	private static Map<String, DeepPrototype> registry = new HashMap<>();

	private RegistryPrototype() {

		// Private constructor to prevent instantiation
	}

	public static void addPrototype(String key, DeepPrototype prototype) {

		registry.put(key, prototype);
	}

	public static DeepPrototype getPrototype(String key) {

		DeepPrototype prototype = registry.get(key);
		return new DeepPrototype(prototype); // Returns a new deep copy
	}
}
