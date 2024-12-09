
package com.ashishrai.design_patterns.creational.builder;

import com.ashishrai.design_patterns.creational.builder.Apartment.ApartmentBuilder;

public class BuilderTest {

	public static void main(String[] args) {

		Apartment apartment = new ApartmentBuilder(3).setFlooring(FlooringType.ITALIAN_MARBLE).setFurnished(true).setNoOfBalconies(3).setSecured(true).build();
		System.out.println(apartment.toString());
	}
}
