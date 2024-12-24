package com.ashishrai.design_patterns.behavioral.command;

public class CommandBankingTest {

	public static void main(String[] args) {
		// Create the bank account
		BankAccount account = new BankAccount(1000);

		// Create command objects
		TransactionCommand depositCommand = new DepositCommand(account, 500);
		TransactionCommand withdrawCommand = new WithdrawCommand(account, 200);

		// Create invoker
		TransactionInvoker invoker = new TransactionInvoker();

		// Execute commands
		invoker.setCommand(depositCommand);
		invoker.executeCommand();
		
		// Undo a command (e.g., withdraw)
		invoker.undoCommand();

		invoker.setCommand(withdrawCommand);
		invoker.executeCommand();

	}

}
