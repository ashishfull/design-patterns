
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public class VPSalaryStrategy implements SalaryStrategy {

	@Override
	public BigDecimal calculateSalary(BigDecimal baseSalary, BigDecimal bonus) {

		return baseSalary.add(bonus.multiply(BigDecimal.valueOf(1.2)));// 20% bonus
	}

	@Override
	public String toString() {

		return "VP Salary Calculation: Base salary + 20% bonus.";
	}
}
