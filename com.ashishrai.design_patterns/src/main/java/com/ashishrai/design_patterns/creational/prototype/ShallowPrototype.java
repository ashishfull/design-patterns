
package com.ashishrai.design_patterns.creational.prototype;

public class ShallowPrototype {

	private int id;
	private CustomObject details;

	public ShallowPrototype(int id, CustomObject details) {

		this.id = id;
		this.details = details;
	}

	// Copy constructor for shallow cloning
	public ShallowPrototype(ShallowPrototype original) {

		this.id = original.id;
		this.details = original.details; // Reference copy (shallow)
	}

	// Getters and setters
	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public CustomObject getDetails() {

		return details;
	}

	public void setDetails(CustomObject details) {

		this.details = details;
	}

	@Override
	public String toString() {

		return "ShallowPrototype{id=" + id + ", details=" + details + "}";
	}
}
