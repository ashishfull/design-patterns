package com.ashishrai.design_patterns.structural.decorator;

import java.math.BigDecimal;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "This is a plain pizza";
	}

	@Override
	public BigDecimal getCost() {
		return BigDecimal.valueOf(500);
	}

}
