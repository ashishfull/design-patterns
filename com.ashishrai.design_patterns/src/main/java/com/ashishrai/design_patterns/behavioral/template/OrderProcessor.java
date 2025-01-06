
package com.ashishrai.design_patterns.behavioral.template;

public abstract class OrderProcessor {

	// Template method: Defines the fixed algorithm
	public final void processOrder() {

		selectItems();
		processPayment();
		deliver();
	}

	protected abstract void selectItems();

	protected abstract void processPayment();

	protected abstract void deliver();
}
