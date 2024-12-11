
package com.ashishrai.design_patterns.structural.composite;

public class Employee extends EmployeeComponent {

	protected Employee(String name) {

		super(name);
	}

	@Override
	public void display() {

		System.out.println("Employee: " + name);
	}
}
