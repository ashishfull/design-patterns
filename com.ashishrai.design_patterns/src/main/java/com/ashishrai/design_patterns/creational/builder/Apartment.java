
package com.ashishrai.design_patterns.creational.builder;

/**
 * Represents an Apartment with various optional and required attributes. Uses the Builder Design Pattern for
 * construction.
 */
public class Apartment {

	// Required and optional attributes of the Apartment
	private int noOfBedrooms; // Required attribute
	private int noOfBalconies; // Optional attribute
	private boolean isFurnished; // Optional attribute
	private boolean isSecured; // Optional attribute
	private FlooringType flooring; // Optional attribute

	/**
	 * Private constructor to enforce the use of the Builder for object creation. Populates attributes based on the
	 * provided Builder instance.
	 */
	private Apartment(ApartmentBuilder builder) {

		this.noOfBedrooms = builder.noOfBedrooms;
		this.noOfBalconies = builder.noOfBalconies;
		this.isFurnished = builder.isFurnished;
		this.isSecured = builder.isSecured;
		this.flooring = builder.flooring;
	}

	// Getter methods for each attribute, providing read-only access.
	public int getNoOfBedrooms() {

		return noOfBedrooms;
	}

	public int getNoOfBalconies() {

		return noOfBalconies;
	}

	public boolean isFurnished() {

		return isFurnished;
	}

	public boolean isSecured() {

		return isSecured;
	}

	public FlooringType getFlooring() {

		return flooring;
	}

	/**
	 * Builder class for constructing Apartment objects. Provides methods to set optional attributes and enforces the
	 * setting of required ones.
	 */
	public static class ApartmentBuilder {

		// Required and optional attributes for Apartment
		private int noOfBedrooms; // Required attribute
		private int noOfBalconies; // Optional attribute
		private boolean isFurnished; // Optional attribute
		private boolean isSecured; // Optional attribute
		private FlooringType flooring; // Optional attribute

		/**
		 * Constructor for ApartmentBuilder, enforcing the setting of the required attribute.
		 *
		 * @param noOfBedrooms
		 *            the number of bedrooms (required).
		 */
		public ApartmentBuilder(int noOfBedrooms) {

			this.noOfBedrooms = noOfBedrooms;
		}

		// Methods to set optional attributes, returning the Builder for chaining.
		public ApartmentBuilder setNoOfBalconies(int noOfBalconies) {

			this.noOfBalconies = noOfBalconies;
			return this;
		}

		public ApartmentBuilder setFurnished(boolean isFurnished) {

			this.isFurnished = isFurnished;
			return this;
		}

		public ApartmentBuilder setSecured(boolean isSecured) {

			this.isSecured = isSecured;
			return this;
		}

		public ApartmentBuilder setFlooring(FlooringType flooring) {

			this.flooring = flooring;
			return this;
		}

		/**
		 * Builds and returns an Apartment object.
		 *
		 * @return the constructed Apartment.
		 */
		public Apartment build() {

			return new Apartment(this);
		}
	}

	/**
	 * Provides a string representation of the Apartment object, detailing its attributes.
	 */
	@Override
	public String toString() {

		StringBuilder apartmentDetails = new StringBuilder();
		apartmentDetails.append(String.format("This apartment has %s bedrooms along with %s balconies.%nIt has flooring of amazing %s ",
		                                      noOfBedrooms,
		                                      noOfBalconies,
		                                      flooring.getDisplayName()));
		if (isFurnished) {
			apartmentDetails.append("Apartment is furnished. ");
		} else {
			apartmentDetails.append("Apartment is unfurnished. ");
		}
		if (isSecured) {
			apartmentDetails.append("Apartment has Biometric Security. ");
		} else {
			apartmentDetails.append("Apartment doesn't have Biometric Security. ");
		}
		return apartmentDetails.toString();
	}
}
