
package com.ashishrai.design_patterns.structural.facade;

public class BankingFacade {

	private Authentication auth;
	private Database db;
	private Logging log;
	private PaymentProcessor payment;

	public BankingFacade() {

		auth = new Authentication();
		db = new Database();
		log = new Logging();
		payment = new PaymentProcessor();
	}

	public void login(String username, String password) {

		auth.login(username, password);
		db.connect();
		log.log("User logged in: " + username);
	}

	public void logout() {

		auth.logout();
		db.disconnect();
		log.log("User logged out");
	}

	public void processPayment(double amount) {

		payment.processPayment(amount);
		log.log("Payment of $" + amount + " processed");
	}
}
