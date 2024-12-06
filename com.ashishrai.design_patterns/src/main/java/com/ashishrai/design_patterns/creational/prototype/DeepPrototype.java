
package com.ashishrai.design_patterns.creational.prototype;

public class DeepPrototype {

	private int id;
	private CustomObject details;

	public DeepPrototype(int id, CustomObject details) {

		this.id = id;
		this.details = details;
	}

	// Copy constructor for deep cloning
	public DeepPrototype(DeepPrototype original) {

		this.id = original.id;
		this.details = new CustomObject(original.details); // Deep copy
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

		return "DeepPrototype{id=" + id + ", details=" + details + "}";
	}
}
