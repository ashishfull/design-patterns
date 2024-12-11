
package com.ashishrai.design_patterns.structural.bridge;

public abstract class RemoteControl {

	protected Device device;

	protected RemoteControl(Device device) {

		this.device = device;
	}

	public abstract void tunrOn();

	public abstract void tunrOff();
}
