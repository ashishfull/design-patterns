
package com.ashishrai.design_patterns.behavioral.state.onboarding;

public class Candidate {

	private ApplicationStatus status;

	public Candidate() {

		this.status = new Applied();
	}

	public void setStatus(ApplicationStatus status) {

		this.status = status;
	}

	public void updateStatus() {

		status.updateStatus(this);
	}
}
