
package com.ashishrai.design_patterns.structural.bridge;

public class BasicRemoteControl extends RemoteControl {

	protected BasicRemoteControl(Device device) {

		super(device);
	}

	@Override
	public void tunrOn() {

		System.out.println("Basic Remote: Switching on the device.");
		device.turnOn();
	}

	@Override
	public void tunrOff() {

		System.out.println("Basic Remote: Switching off the device.");
		device.turnOff();
	}
}
