package com.ashishrai.design_patterns.structural.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		// Start with a plain pizza
        Pizza pizza = new PlainPizza();

        // Add cheese
        //pizza = new CheeseBurstDecorator(pizza);

        // Add pepperoni
        pizza = new PepperoniDecorator(pizza);

        // Display the final pizza description and cost
        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Total Cost: $" + pizza.getCost());
	}

}
