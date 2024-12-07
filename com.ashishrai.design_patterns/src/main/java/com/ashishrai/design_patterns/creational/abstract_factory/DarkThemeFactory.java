package com.ashishrai.design_patterns.creational.abstract_factory;

public class DarkThemeFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new DarkButton();
	}

	@Override
	public TextField createTextField() {
		return new DarkTextField();
	}

}
