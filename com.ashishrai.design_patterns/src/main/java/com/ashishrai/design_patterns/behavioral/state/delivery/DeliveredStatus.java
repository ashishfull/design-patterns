
package com.ashishrai.design_patterns.behavioral.state.delivery;

public class DeliveredStatus implements DeliveryStatus {

	@Override
	public void updateStatus(Package pkg) {

		System.out.println("Package delivered to the customer!");
	}
}
