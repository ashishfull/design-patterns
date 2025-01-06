
package com.ashishrai.design_patterns.behavioral.iterator;

public interface EmployeeCollection {

	void addEmployee(Employee employee);

	void removeEmployee(Employee employee);

	EmployeeIterator iterator();
}
