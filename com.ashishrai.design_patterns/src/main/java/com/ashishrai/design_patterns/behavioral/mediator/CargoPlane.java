
package com.ashishrai.design_patterns.behavioral.mediator;

public class CargoPlane extends Aircraft {

	public CargoPlane(AirTrafficControl airTrafficControl, String name) {

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
