
package com.ashishrai.design_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements EmployeeCollection {

	private final List<Employee> employees = new ArrayList<>();

	@Override
	public void addEmployee(Employee employee) {

		employees.add(employee);
	}

	@Override
	public void removeEmployee(Employee employee) {

		employees.remove(employee);
	}

	@Override
	public EmployeeIterator iterator() {

		return new EmployeeListIterator(employees);
	}
}
