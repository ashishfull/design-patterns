
package com.ashishrai.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Director extends EmployeeComponent {

	private List<EmployeeComponent> children = new ArrayList<>();

	protected Director(String name) {

		super(name);
	}

	@Override
	public void add(EmployeeComponent component) {

		children.add(component);
	}

	@Override
	public void remove(EmployeeComponent component) {

		children.remove(component);
	}

	@Override
	public void display() {

		System.out.println("Director: " + name);
		for (EmployeeComponent child : children) {
			child.display();
		}
	}
}
