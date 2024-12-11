
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public class ManagerSalaryStrategy implements SalaryStrategy {

	@Override
	public BigDecimal calculateSalary(BigDecimal baseSalary, BigDecimal bonus) {

		return baseSalary.add((bonus.multiply(BigDecimal.valueOf(1.1)))); //10% bonus
	}

	@Override
	public String toString() {

		return "Manager Salary Calculation: Base salary + 10% bonus.";
	}
}
