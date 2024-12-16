
package com.ashishrai.design_patterns.behavioral.state.onboarding;

public class Interviewing implements ApplicationStatus {

	@Override
	public void updateStatus(Candidate player) {

		System.out.println("Interviewing in progress!");
		player.setStatus(new Selected());
	}
}
