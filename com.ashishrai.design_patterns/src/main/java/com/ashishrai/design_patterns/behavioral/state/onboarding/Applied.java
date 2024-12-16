
package com.ashishrai.design_patterns.behavioral.state.onboarding;

public class Applied implements ApplicationStatus {

	@Override
	public void updateStatus(Candidate player) {

		System.out.println("Thank you for applying. Application is in progress!");
		player.setStatus(new Shortlisted());
	}
}
