
package com.ashishrai.design_patterns.structural.flyweight.animals;

public class AnimalType implements AnimalInterface {

	private final String name;
	private final String habitat;
	private final String diet;

	public AnimalType(String name, String habitat, String diet) {

		super();
		this.name = name;
		this.habitat = habitat;
		this.diet = diet;
	}

	@Override
	public void describe(int x, int y) {

		System.out.println("Displaying a " + habitat + " animal (" + name + ") with diet [" + diet + "] at (" + x + ", " + y + ")");
	}
}
