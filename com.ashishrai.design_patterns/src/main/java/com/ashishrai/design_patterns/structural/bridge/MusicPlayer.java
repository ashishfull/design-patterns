
package com.ashishrai.design_patterns.structural.bridge;

public class MusicPlayer implements Device {

	@Override
	public void turnOn() {

		System.out.println("Music Player is switched on!");
	}

	@Override
	public void turnOff() {

		System.out.println("Music Player is switched off!");
	}

	@Override
	public void setVolume(int volume) {

		System.out.println(String.format("Music Player volume set to %s ", volume));
	}
}
