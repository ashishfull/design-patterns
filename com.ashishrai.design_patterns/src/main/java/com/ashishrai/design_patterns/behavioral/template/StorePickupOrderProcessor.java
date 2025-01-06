
package com.ashishrai.design_patterns.behavioral.template;

public class StorePickupOrderProcessor extends OrderProcessor {

	@Override
	protected void selectItems() {

		System.out.println("Items selected at the store.");
	}

	@Override
	protected void processPayment() {

		System.out.println("Payment processed at the store counter.");
	}

	@Override
	protected void deliver() {

		System.out.println("Pickup code generated. Order ready for collection.");
	}
}
