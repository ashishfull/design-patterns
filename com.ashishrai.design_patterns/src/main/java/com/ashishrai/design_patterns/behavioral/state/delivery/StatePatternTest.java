
package com.ashishrai.design_patterns.behavioral.state.delivery;

public class StatePatternTest {

	public static void main(String[] args) {

		Package myPackage = new Package();
		// Moving through states
		myPackage.updateStatus(); // Ordered -> Shipped
		myPackage.updateStatus(); // Shipped -> Delivered
		myPackage.updateStatus(); // Delivered -> No transition
	}
}
