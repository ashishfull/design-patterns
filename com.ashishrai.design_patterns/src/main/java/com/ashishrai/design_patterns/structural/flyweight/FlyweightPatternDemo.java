
package com.ashishrai.design_patterns.structural.flyweight;

public class FlyweightPatternDemo {

	public static void main(String[] args) {

		Forest forest = new Forest();
		forest.plantTree(1, 2, "Oak", "Green", "Rough");
		forest.plantTree(3, 4, "Pine", "Dark Green", "Smooth");
		forest.plantTree(5, 6, "Oak", "Green", "Rough"); // Reuses existing TreeType
		forest.plantTree(7, 8, "Maple", "Red", "Fine");
		forest.plantTree(7, 7, "Pine", "Dark Green", "Smooth"); // Reuses existing TreeType
		forest.displayTrees();
		forest.addAnimal(0, 0, "Dog", "Land", "Omnivore");
		forest.addAnimal(1, 1, "Dog", "Land", "Omnivore"); // Reuses existing AnimalType
		forest.addAnimal(10, 10, "Dog", "Land", "Omnivore"); // Reuses existing AnimalType
		forest.addAnimal(20, 20, "Dog", "Land", "Omnivore"); // Reuses existing AnimalType
		forest.addAnimal(5, 5, "Cow", "Land", "Herbivore");
		forest.addAnimal(15, 15, "Cow", "Land", "Herbivore"); // Reuses existing AnimalType
		forest.addAnimal(25, 25, "Cow", "Land", "Herbivore"); // Reuses existing AnimalType
		forest.addAnimal(35, 35, "Cow", "Land", "Herbivore"); // Reuses existing AnimalType
		forest.addAnimal(54, 45, "Turtle", "Land and Water", "Herbivore");
		forest.addAnimal(53, 35, "Turtle", "Land and Water", "Herbivore"); // Reuses existing AnimalType
		forest.addAnimal(52, 25, "Shark", "Water", "Carnivore");
		forest.addAnimal(59, 95, "Shark", "Water", "Carnivore"); // Reuses existing AnimalType
		forest.describeAnimals();
	}
}
