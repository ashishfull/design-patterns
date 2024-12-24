package com.ashishrai.design_patterns.behavioral.chain_of_responsibility;

import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers.HelpdeskHandler;
import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers.Manager;
import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers.Receptionist;
import com.ashishrai.design_patterns.behavioral.chain_of_responsibility.handlers.SupportStaff;

public class CORPatternTest {

	public static void main(String[] args) {// Create handlers
		HelpdeskHandler receptionist = new Receptionist();
		HelpdeskHandler supportStaff = new SupportStaff();
		HelpdeskHandler manager = new Manager();

		// Build the chain
		receptionist.setNextHandler(supportStaff);
		supportStaff.setNextHandler(manager);

		// Test the chain
		System.out.println("Request: General Inquiry");
		receptionist.handleRequest(IssueType.GENERAL);

		System.out.println("\nRequest: Technical Issue");
		receptionist.handleRequest(IssueType.TECHNICAL);

		System.out.println("\nRequest: Critical Issue");
		receptionist.handleRequest(IssueType.CRITICAL);

		System.out.println("\nRequest: Unknown Issue");
		receptionist.handleRequest(IssueType.UNKNOWN);
	}

}
