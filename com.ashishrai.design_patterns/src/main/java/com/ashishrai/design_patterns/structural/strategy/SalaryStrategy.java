
package com.ashishrai.design_patterns.structural.strategy;

import java.math.BigDecimal;

public interface SalaryStrategy {

	BigDecimal calculateSalary(BigDecimal baseSalary, BigDecimal bonus);
}
