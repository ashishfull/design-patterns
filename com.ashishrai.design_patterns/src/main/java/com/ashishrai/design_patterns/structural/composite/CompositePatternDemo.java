
package com.ashishrai.design_patterns.structural.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {

		EmployeeComponent emp1 = new Employee("Alice");
		EmployeeComponent emp2 = new Employee("Bob");
		EmployeeComponent emp3 = new Employee("Charlie");
		EmployeeComponent manager = new Manager("Eve");
		manager.add(emp1);
		manager.add(emp2);
		EmployeeComponent avp = new AVP("David");
		avp.add(manager);
		avp.add(emp3);
		EmployeeComponent vp = new VP("Emily");
		vp.add(avp);
		EmployeeComponent director = new Director("Grace");
		director.add(vp);
		EmployeeComponent ceo = new CEO("Hannah");
		ceo.add(director);
		ceo.display();
	}
}
