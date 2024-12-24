package com.ashishrai.design_patterns.behavioral.command;

public interface TransactionCommand {
	void execute();

	void undo();
}
