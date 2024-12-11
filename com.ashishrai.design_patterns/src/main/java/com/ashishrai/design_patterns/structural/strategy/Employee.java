
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public class Employee {

	private SalaryStrategy salaryStrategy;
	private BigDecimal baseSalary;
	private BigDecimal bonus;

	public Employee(BigDecimal baseSalary, BigDecimal bonus, SalaryStrategy salaryStrategy) {

		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.salaryStrategy = salaryStrategy;
	}

	public BigDecimal calculateSalary() {

		return salaryStrategy.calculateSalary(baseSalary, bonus);
	}

	public void setSalaryStrategy(SalaryStrategy salaryStrategy) {

		this.salaryStrategy = salaryStrategy;
	}

	@Override
	public String toString() {

		return "Employee has a " + "baseSalary=" + baseSalary.toString() + ",\n bonus=" + bonus.toString() + ",\n salaryStrategy=" + salaryStrategy + "\n\n";
	}
}
