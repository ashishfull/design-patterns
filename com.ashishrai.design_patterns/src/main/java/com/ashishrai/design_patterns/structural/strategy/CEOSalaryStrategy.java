
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public class CEOSalaryStrategy implements SalaryStrategy {

	@Override
	public BigDecimal calculateSalary(BigDecimal baseSalary, BigDecimal bonus) {

		return baseSalary.add(bonus.multiply(BigDecimal.valueOf(2)));// 200% bonus
	}

	@Override
	public String toString() {

		return "CEO Salary Calculation: Base salary + 200% bonus.";
	}
}
