
package com.ashishrai.design_patterns.behavioral.mediator;

public interface AirTrafficControl {

	void sendMessage(String message, Aircraft sender);

	void registerAircraft(Aircraft aircraft);
}
