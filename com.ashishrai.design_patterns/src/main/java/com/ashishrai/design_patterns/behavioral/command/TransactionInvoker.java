package com.ashishrai.design_patterns.behavioral.command;

public class TransactionInvoker {
	private TransactionCommand command;

	public void setCommand(TransactionCommand command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}

	public void undoCommand() {
		command.undo();
	}

}
