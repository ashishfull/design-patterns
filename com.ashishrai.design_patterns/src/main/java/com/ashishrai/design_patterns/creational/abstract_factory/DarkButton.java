package com.ashishrai.design_patterns.creational.abstract_factory;

public class DarkButton implements Button {

	@Override
	public void render() {
		System.out.println("Dark Button Rendered!");

	}

	@Override
	public void click() {
		System.out.println("Dark Button Clicked!");

	}

}
