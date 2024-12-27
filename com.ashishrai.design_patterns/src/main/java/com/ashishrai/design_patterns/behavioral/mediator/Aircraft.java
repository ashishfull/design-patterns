
package com.ashishrai.design_patterns.behavioral.mediator;

public abstract class Aircraft {

	protected AirTrafficControl airTrafficControl;
	protected String name;

	public Aircraft(AirTrafficControl airTrafficControl, String name) {

		this.airTrafficControl = airTrafficControl;
		this.name = name;
		airTrafficControl.registerAircraft(this);
	}

	public abstract void send(String message);

	public abstract void receive(String message);
}
