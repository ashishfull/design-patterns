package com.ashishrai.design_patterns.behavioral.command;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + ". New balance: " + balance);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrew " + amount + ". New balance: " + balance);
		} else {
			System.out.println("Insufficient funds for withdrawal of " + amount);
		}
	}

	public double getBalance() {
		return balance;
	}
}
