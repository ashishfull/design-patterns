
package com.ashishrai.design_patterns.structural.facade;

public class Authentication {

	public void login(String username, String password) {

		System.out.println(String.format("User %s logged in", username));
	}

	public void logout() {

		System.out.println("User logged out");
	}
}
