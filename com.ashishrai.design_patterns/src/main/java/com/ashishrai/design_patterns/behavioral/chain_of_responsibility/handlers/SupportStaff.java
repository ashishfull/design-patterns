package com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers;

import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.IssueType;

public class SupportStaff implements HelpdeskHandler {
	private HelpdeskHandler nextHandler;

	@Override
	public void setNextHandler(HelpdeskHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(IssueType issue) {
		if (issue.equals(IssueType.TECHNICAL)) {
            System.out.println("Support Staff: Resolving technical issue.");
        } else {
            System.out.println("Support Staff: Passing to the next handler.");
            if (nextHandler != null) nextHandler.handleRequest(issue);
        }
	}

}
