
package com.ashishrai.design_patterns.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {

	protected AdvancedRemoteControl(Device device) {

		super(device);
	}

	@Override
	public void tunrOn() {

		System.out.println("Advanced Remote: Switching on the device.");
		device.turnOn();
	}

	@Override
	public void tunrOff() {

		System.out.println("Advanced Remote: Switching off the device.");
		device.turnOff();
	}

	public void setVolume(int volume) {

		System.out.println("Advanced Remote: Setting volume on the device.");
		device.setVolume(volume);
	}
}
