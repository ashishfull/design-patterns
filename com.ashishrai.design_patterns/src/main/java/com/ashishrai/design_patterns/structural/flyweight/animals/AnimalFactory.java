
package com.ashishrai.design_patterns.structural.flyweight.animals;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {

	private static final Map<String, AnimalType> animalTypes = new HashMap<>();

	private AnimalFactory() {
		// adding a private constructor to hide the implicit one

	}

	public static AnimalType getAnimalType(String name, String habitat, String diet) {

		String key = name + "-" + habitat + "-" + diet;
		if ( !animalTypes.containsKey(key)) {
			System.out.println("Creating a new AnimalType for: " + key);
			animalTypes.put(key, new AnimalType(name, habitat, diet));
		}
		return animalTypes.get(key);
	}
}
