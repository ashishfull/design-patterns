package com.ashishrai.design_patterns.creational.abstract_factory;

public class LightTextField implements TextField {

	@Override
	public void display() {
		System.out.println("Light Text Field Displayed!");

	}

	@Override
	public void typeText(String text) {
		System.out.println(String.format("Typing %s in the Light Text Field!", text));

	}

}
