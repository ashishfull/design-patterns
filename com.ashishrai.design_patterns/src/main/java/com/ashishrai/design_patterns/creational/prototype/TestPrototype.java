
package com.ashishrai.design_patterns.creational.prototype;

public class TestPrototype {

	public static void main(String[] args) {

		// Testing Shallow Cloning
		System.out.println("Testing Shallow Cloning:");
		CustomObject customObject1 = new CustomObject("Original Object");
		ShallowPrototype shallowPrototype1 = new ShallowPrototype(1, customObject1);
		ShallowPrototype shallowClone = new ShallowPrototype(shallowPrototype1);
		System.out.println("Original: " + shallowPrototype1);
		System.out.println("Clone: " + shallowClone);
		// Modifying the CustomObject
		customObject1.setDescription("Modified Object");
		System.out.println("After modifying original CustomObject:");
		System.out.println("Original: " + shallowPrototype1);
		System.out.println("Clone: " + shallowClone);
		// Testing Deep Cloning
		System.out.println("\nTesting Deep Cloning:");
		CustomObject customObject2 = new CustomObject("Original Object");
		DeepPrototype deepPrototype1 = new DeepPrototype(2, customObject2);
		DeepPrototype deepClone = new DeepPrototype(deepPrototype1);
		System.out.println("Original: " + deepPrototype1);
		System.out.println("Clone: " + deepClone);
		// Modifying the CustomObject
		customObject2.setDescription("Modified Object");
		System.out.println("After modifying original CustomObject:");
		System.out.println("Original: " + deepPrototype1);
		System.out.println("Clone: " + deepClone);
		// Testing Registry Prototype
		System.out.println("\nTesting Registry Prototype:");
		DeepPrototype registryPrototype = new DeepPrototype(3, new CustomObject("Registry Object"));
		RegistryPrototype.addPrototype("Prototype1", registryPrototype);
		DeepPrototype clonedFromRegistry = RegistryPrototype.getPrototype("Prototype1");
		System.out.println("Registry Original: " + registryPrototype);
		System.out.println("Cloned from Registry: " + clonedFromRegistry);
		// Modifying the cloned object
		clonedFromRegistry.getDetails().setDescription("Modified Registry Object");
		System.out.println("After modifying cloned object:");
		System.out.println("Registry Original: " + registryPrototype);
		System.out.println("Cloned from Registry: " + clonedFromRegistry);
	}
}
