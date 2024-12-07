package com.ashishrai.design_patterns.creational.abstract_factory;

public class DarkTextField implements TextField {

	@Override
	public void display() {
		System.out.println("Dark Text Field displayed!");

	}

	@Override
	public void typeText(String text) {
		System.out.println(String.format("Typing %s in the Dark Text Field!", text));

	}

}
