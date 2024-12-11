package com.ashishrai.design_patterns.structural.decorator;

import java.math.BigDecimal;

public class PepperoniDecorator extends PizzaDecorator {

	protected PepperoniDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", pepporoni";
	}
	
	@Override
	public BigDecimal getCost() {
		return pizza.getCost().add(BigDecimal.valueOf(50));
	}

}
