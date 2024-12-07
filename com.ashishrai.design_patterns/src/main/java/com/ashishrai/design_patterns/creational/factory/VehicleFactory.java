package com.ashishrai.design_patterns.creational.factory;

public class VehicleFactory {

	// Private constructor to prevent instantiation
	private VehicleFactory() {
		throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
	}

	public static Vehicle getVehicle(VehicleType vehicleType) {
		if (vehicleType == null) {
			throw new IllegalArgumentException("Vehicle type cannot be null");
		}
		switch (vehicleType) {
		case CAR:
			return new Car();
		case BIKE:
			return new Bike();
		case TRUCK:
			return new Truck();
		default:
			throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
		}
	}
}
