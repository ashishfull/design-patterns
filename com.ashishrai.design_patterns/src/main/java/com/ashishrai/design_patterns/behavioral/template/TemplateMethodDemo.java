
package com.ashishrai.design_patterns.behavioral.template;

public class TemplateMethodDemo {

	public static void main(String[] args) {

		OrderProcessor onlineOrder = new OnlineOrderProcessor();
		OrderProcessor storePickupOrder = new StorePickupOrderProcessor();
		System.out.println("Processing Online Order:");
		onlineOrder.processOrder();
		System.out.println("\nProcessing Store Pickup Order:");
		storePickupOrder.processOrder();
	}
}
