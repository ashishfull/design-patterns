
package com.ashishrai.design_patterns.behavioral.mediator;

public class TestMediatorPattern {

	public static void main(String[] args) {

		AirTrafficControl airTrafficControl = new AirTrafficController();
		Aircraft plane1 = new PassengerPlane(airTrafficControl, "PassengerPlane A");
		Aircraft plane2 = new PassengerPlane(airTrafficControl, "PassengerPlane B");
		Aircraft cargo1 = new CargoPlane(airTrafficControl, "CargoPlane C");
		plane1.send("Requesting permission to land.");
		System.out.println("-----------------------------------");
		cargo1.send("Requesting permission to take off.");
	}
}
