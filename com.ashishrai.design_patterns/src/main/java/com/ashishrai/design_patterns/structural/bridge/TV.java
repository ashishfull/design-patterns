
package com.ashishrai.design_patterns.structural.bridge;

public class TV implements Device {

	@Override
	public void turnOn() {

		System.out.println("Tv is switched on!");
	}

	@Override
	public void turnOff() {

		System.out.println("Tv is switched off!");
	}

	@Override
	public void setVolume(int volume) {

		System.out.println(String.format("Tv volume set to %s ", volume));
	}
}
