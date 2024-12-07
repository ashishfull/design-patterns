package com.ashishrai.design_patterns.creational.abstract_factory;

public class LightButton implements Button {

	@Override
	public void render() {
		System.out.println("Light Button Rendered!");
		
	}

	@Override
	public void click() {
		System.out.println("Light Button Clicked!");
		
	}

}
