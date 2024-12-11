
package com.ashishrai.design_patterns.structural.composite;

public abstract class EmployeeComponent {

	protected String name;

	protected EmployeeComponent(String name) {

		this.name = name;
	}

	public void add(EmployeeComponent component) {

		throw new UnsupportedOperationException("Add operation is not supported");
	}

	public void remove(EmployeeComponent component) {

		throw new UnsupportedOperationException("Remove operation is not supported");
	}

	public void display() {

		throw new UnsupportedOperationException("Display operation is not supported");
	}
}
