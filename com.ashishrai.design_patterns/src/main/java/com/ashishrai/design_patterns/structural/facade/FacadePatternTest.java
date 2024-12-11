
package com.ashishrai.design_patterns.structural.facade;

public class FacadePatternTest {

	public static void main(String[] args) {

		BankingFacade bankingFacade = new BankingFacade();
		bankingFacade.login("user", "password");
		bankingFacade.processPayment(250.75);
		bankingFacade.logout();
	}
}
