
package com.ashishrai.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class AVP extends EmployeeComponent {

	private List<EmployeeComponent> children = new ArrayList<>();

	protected AVP(String name) {

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

		System.out.println("AVP: " + name);
		for (EmployeeComponent child : children) {
			child.display();
		}
	}
}
