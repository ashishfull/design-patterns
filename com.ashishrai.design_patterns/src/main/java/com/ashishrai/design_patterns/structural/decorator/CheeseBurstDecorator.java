package com.ashishrai.design_patterns.structural.decorator;

import java.math.BigDecimal;

public class CheeseBurstDecorator extends PizzaDecorator {

	protected CheeseBurstDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese Burst";
	}
	
	@Override
	public BigDecimal getCost() {
		return pizza.getCost().add(BigDecimal.valueOf(100));
	}

}
