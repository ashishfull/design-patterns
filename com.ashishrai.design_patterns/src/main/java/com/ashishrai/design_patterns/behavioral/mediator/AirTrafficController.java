
package com.ashishrai.design_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements AirTrafficControl {

	private final List<Aircraft> aircraftList = new ArrayList<>();

	@Override
	public void sendMessage(String message, Aircraft sender) {

		for (Aircraft aircraft : aircraftList) {
			if (aircraft != sender) {
				aircraft.receive(message);
			}
		}
	}

	@Override
	public void registerAircraft(Aircraft aircraft) {

		aircraftList.add(aircraft);
	}
}
