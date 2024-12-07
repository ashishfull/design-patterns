package com.ashishrai.design_patterns.creational.abstract_factory;

public class LightThemeFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new LightButton();
	}

	@Override
	public TextField createTextField() {
		return new LightTextField();
	}

}
