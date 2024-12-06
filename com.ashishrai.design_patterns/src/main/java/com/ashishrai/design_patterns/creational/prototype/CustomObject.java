
package com.ashishrai.design_patterns.creational.prototype;

public class CustomObject {

	private String description;

	public CustomObject(String description) {

		this.description = description;
	}

	public CustomObject(CustomObject original) {

		this.description = original.description;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	@Override
	public String toString() {

		return "CustomObject{description='" + description + "'}";
	}
}
