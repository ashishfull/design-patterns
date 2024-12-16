
package com.ashishrai.design_patterns.behavioral.state.onboarding;

public class Selected implements ApplicationStatus {

	@Override
	public void updateStatus(Candidate player) {

		System.out.println("Congratulations! You are selected!!");
	}
}
