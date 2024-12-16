
package com.ashishrai.design_patterns.behavioral.state.delivery;

public class ShippedStatus implements DeliveryStatus {

	@Override
	public void updateStatus(Package pkg) {

		System.out.println("Package shipped. On the way...");
		pkg.setStatus(new DeliveredStatus());
	}
}
