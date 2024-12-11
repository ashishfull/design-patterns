
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public class EmployeeSalaryStrategy implements SalaryStrategy {

	@Override
	public BigDecimal calculateSalary(BigDecimal baseSalary, BigDecimal bonus) {

		return baseSalary;// no bonus
	}

	@Override
	public String toString() {

		return "Employee Salary Calculation: Basic salary without bonus.";
	}
}
