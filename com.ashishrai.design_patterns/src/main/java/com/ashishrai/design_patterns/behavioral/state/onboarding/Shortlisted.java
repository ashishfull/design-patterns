
package com.ashishrai.design_patterns.behavioral.state.onboarding;

public class Shortlisted implements ApplicationStatus {

	@Override
	public void updateStatus(Candidate player) {

		System.out.println("The application has been shortlisted!");
		player.setStatus(new Interviewing());
	}
}
