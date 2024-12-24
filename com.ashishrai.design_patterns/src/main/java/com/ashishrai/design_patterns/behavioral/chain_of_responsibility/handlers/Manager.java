package com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers;

import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.IssueType;

public class Manager implements HelpdeskHandler {
	private HelpdeskHandler nextHandler;

	@Override
	public void setNextHandler(HelpdeskHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(IssueType issue) {
		if (issue.equals(IssueType.CRITICAL)) {
			System.out.println("Manager: Handling critical issue.");
		} else {
			System.out.println("Manager: Unable to resolve the issue.");
		}
	}

}
