
package com.ashishrai.design_patterns.behavioral.mediator;

public class PassengerPlane extends Aircraft {

	public PassengerPlane(AirTrafficControl airTrafficControl, String name) {

		super(airTrafficControl, name);
	}

	@Override
	public void send(String message) {

		System.out.println(name + " sending message: " + message);
		airTrafficControl.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {

		System.out.println(name + " received message: " + message);
	}
}
