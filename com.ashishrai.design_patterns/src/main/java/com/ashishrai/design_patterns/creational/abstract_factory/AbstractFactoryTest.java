package com.ashishrai.design_patterns.creational.abstract_factory;

import java.util.Random;

enum Theme {
	LIGHT, DARK
}

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		GUIFactory factory;
        Theme selectedTheme = Theme.values()[new Random().nextInt(Theme.values().length)];

		// Decide the theme dynamically (Light or Dark)
		if (selectedTheme.equals(Theme.LIGHT)) {
			factory = new LightThemeFactory();
		} else {
			factory = new DarkThemeFactory();
		}

		// Use the factory to create components
		Button button = factory.createButton();
		TextField textField = factory.createTextField();

		// Interact with the components
		button.render();
		button.click();
		textField.display();
		textField.typeText("Test String");
	}

}
