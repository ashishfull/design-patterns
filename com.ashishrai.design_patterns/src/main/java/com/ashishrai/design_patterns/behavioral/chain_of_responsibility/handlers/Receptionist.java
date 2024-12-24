package com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers;

import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.IssueType;

public class Receptionist implements HelpdeskHandler {

	private HelpdeskHandler nextHandler;

	@Override
	public void setNextHandler(HelpdeskHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(IssueType issue) {
		if (issue.equals(IssueType.GENERAL)) {
			System.out.println("Receptionist: Handling general inquiry.");
		} else {
			System.out.println("Receptionist: Passing to the next handler.");
			if (nextHandler != null)
				nextHandler.handleRequest(issue);
		}
	}

}
