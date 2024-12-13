
package com.ashishrai.design_patterns.structural.flyweight.trees;

public class Tree {

	private final int x;
	private final int y;
	private final TreeType type;

	public Tree(int x, int y, TreeType type) {

		this.x = x;
		this.y = y;
		this.type = type;
	}

	public void display() {

		type.display(x, y);
	}
}
