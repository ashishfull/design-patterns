package com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers;

import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.IssueType;

public interface HelpdeskHandler {

	void setNextHandler(HelpdeskHandler nextHandler);

	void handleRequest(IssueType issue);

}
