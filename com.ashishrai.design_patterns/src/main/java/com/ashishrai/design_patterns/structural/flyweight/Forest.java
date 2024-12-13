
package com.ashishrai.design_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

import com.ashishrai.design_patterns.structural.flyweight.animals.Animal;
import com.ashishrai.design_patterns.structural.flyweight.animals.AnimalFactory;
import com.ashishrai.design_patterns.structural.flyweight.animals.AnimalType;
import com.ashishrai.design_patterns.structural.flyweight.trees.Tree;
import com.ashishrai.design_patterns.structural.flyweight.trees.TreeFactory;
import com.ashishrai.design_patterns.structural.flyweight.trees.TreeType;

public class Forest {

	private final List<Tree> trees = new ArrayList<>();
	private final List<Animal> animals = new ArrayList<>();

	public void plantTree(int x, int y, String name, String color, String texture) {

		TreeType type = TreeFactory.getTreeType(name, color, texture);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}

	public void addAnimal(int x, int y, String name, String habitat, String diet) {

		AnimalType type = AnimalFactory.getAnimalType(name, habitat, diet);
		Animal animal = new Animal(x, y, type);
		animals.add(animal);
	}

	public void displayTrees() {

		for (Tree tree : trees) {
			tree.display();
		}
	}

	public void describeAnimals() {

		for (Animal animal : animals) {
			animal.describe();
		}
	}
}
