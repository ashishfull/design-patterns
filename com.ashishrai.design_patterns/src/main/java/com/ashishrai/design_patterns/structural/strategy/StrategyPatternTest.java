
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public class StrategyPatternTest {

	public static void main(String[] args) {

		// Creating employees with different salary strategies
		Employee emp1 = new Employee(BigDecimal.valueOf(50000), BigDecimal.valueOf(5000), new EmployeeSalaryStrategy());
		Employee emp2 = new Employee(BigDecimal.valueOf(70000), BigDecimal.valueOf(7000), new ManagerSalaryStrategy());
		Employee emp3 = new Employee(BigDecimal.valueOf(100000), BigDecimal.valueOf(10000), new VPSalaryStrategy());
		Employee emp4 = new Employee(BigDecimal.valueOf(150000), BigDecimal.valueOf(15000), new CEOSalaryStrategy());
		// Displaying salary calculations
		System.out.println(emp1 + " -> Calculated Salary: INR" + emp1.calculateSalary());
		System.out.println(emp2 + " -> Calculated Salary: INR" + emp2.calculateSalary());
		System.out.println(emp3 + " -> Calculated Salary: INR" + emp3.calculateSalary());
		System.out.println(emp4 + " -> Calculated Salary: INR" + emp4.calculateSalary());
	}
}
