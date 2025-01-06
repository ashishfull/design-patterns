
package com.ashishrai.design_patterns.behavioral.template;

public class OnlineOrderProcessor extends OrderProcessor {

	@Override
	protected void selectItems() {

		System.out.println("Items selected and added to the online cart.");
	}

	@Override
	protected void processPayment() {

		System.out.println("Payment processed via online gateway.");
	}

	@Override
	protected void deliver() {

		System.out.println("Order shipped to the provided address.");
	}
}
