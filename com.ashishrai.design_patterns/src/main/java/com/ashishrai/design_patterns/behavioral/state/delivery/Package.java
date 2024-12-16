
package com.ashishrai.design_patterns.behavioral.state.delivery;

public class Package {

	private DeliveryStatus status;

	public Package() {

		this.status = new OrderedStatus();
	}

	public void setStatus(DeliveryStatus status) {

		this.status = status;
	}

	public void updateStatus() {

		status.updateStatus(this);
	}
}
