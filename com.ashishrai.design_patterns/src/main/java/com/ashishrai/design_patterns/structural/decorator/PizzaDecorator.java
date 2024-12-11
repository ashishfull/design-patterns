package com.ashishrai.design_patterns.structural.decorator;

import java.math.BigDecimal;

public abstract class PizzaDecorator implements Pizza {
	
	protected Pizza pizza;
	
	protected PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public BigDecimal getCost() {
		return pizza.getCost();
	}

}
