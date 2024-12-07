package com.ashishrai.design_patterns.creational.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
		car.design();
		car.manufacture();

		Vehicle bike = VehicleFactory.getVehicle(VehicleType.BIKE);
		bike.design();
		bike.manufacture();

		Vehicle truck = VehicleFactory.getVehicle(VehicleType.TRUCK);
		truck.design();
		truck.manufacture();

		// Vehicle invalid = VehicleFactory.getVehicle("invalid"); // Compile-time
		// error!
	}
}
