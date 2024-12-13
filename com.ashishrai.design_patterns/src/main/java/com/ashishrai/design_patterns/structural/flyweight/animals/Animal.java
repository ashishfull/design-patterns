
package com.ashishrai.design_patterns.structural.flyweight.animals;

public class Animal {

	int x;
	int y;
	AnimalType animalType;

	public Animal(int x, int y, AnimalType animalType) {

		this.x = x;
		this.y = y;
		this.animalType = animalType;
	}

	public void describe() {

		animalType.describe(x, y);
	}
}
