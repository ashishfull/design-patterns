
package com.ashishrai.design_patterns.structural.flyweight.trees;

public class TreeType implements TreeInterface {

	private final String name;
	private final String color;
	private final String texture;

	public TreeType(String name, String color, String texture) {

		super();
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	@Override
	public void display(int x, int y) {

		System.out.println("Displaying a " + color + " tree (" + name + ") with texture [" + texture + "] at (" + x + ", " + y + ")");
	}
}
