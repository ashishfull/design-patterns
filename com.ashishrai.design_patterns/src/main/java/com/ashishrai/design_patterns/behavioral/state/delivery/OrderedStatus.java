
package com.ashishrai.design_patterns.behavioral.state.delivery;

public class OrderedStatus implements DeliveryStatus {

	@Override
	public void updateStatus(Package pkg) {

		System.out.println("Package ordered. Awaiting shipment...");
		pkg.setStatus(new ShippedStatus());
	}
}
