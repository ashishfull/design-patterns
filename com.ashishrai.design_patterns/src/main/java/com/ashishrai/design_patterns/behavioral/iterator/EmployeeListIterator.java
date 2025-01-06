
package com.ashishrai.design_patterns.behavioral.iterator;

import java.util.List;

public class EmployeeListIterator implements EmployeeIterator {

	private final List<Employee> employees;
	private int position = 0;

	public EmployeeListIterator(List<Employee> employees) {

		this.employees = employees;
	}

	@Override
	public boolean hasNext() {

		return position < employees.size();
	}

	@Override
	public Employee next() {

		if ( !hasNext()) {
			throw new IllegalStateException("No more elements.");
		}
		return employees.get(position++);
	}
}
