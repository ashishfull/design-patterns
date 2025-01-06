
package com.ashishrai.design_patterns.behavioral.iterator;

public class IteratorPatternTest {

	public static void main(String[] args) {

		EmployeeCollection employeeList = new EmployeeList();
		employeeList.addEmployee(new Employee("Alice", "HR"));
		employeeList.addEmployee(new Employee("Bob", "IT"));
		employeeList.addEmployee(new Employee("Charlie", "Finance"));
		employeeList.addEmployee(new Employee("Ashish", "Dev"));
		EmployeeIterator iterator = employeeList.iterator();
		System.out.println("Employee Directory:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
