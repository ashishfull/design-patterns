
package com.ashishrai.design_patterns.creational.builder;

public enum FlooringType {

	ITALIAN_MARBLE("Italian Marble"), VITRIFIED("Vitrified"), CERAMIC("Ceramic");

	private final String displayName; // Field to hold the custom name

	// Constructor to initialize the custom name
	FlooringType(String displayName) {

		this.displayName = displayName;
	}

	// Getter to retrieve the custom name
	public String getDisplayName() {

		return displayName;
	}

	// Optional: Override toString to use the custom name
	@Override
	public String toString() {

		return displayName;
	}
}
