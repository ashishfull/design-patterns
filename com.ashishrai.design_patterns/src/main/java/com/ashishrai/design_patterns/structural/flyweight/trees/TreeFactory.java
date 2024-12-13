
package com.ashishrai.design_patterns.structural.flyweight.trees;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

	private static final Map<String, TreeType> treeTypes = new HashMap<>();

	private TreeFactory() {

		// adding a private constructor to hide the implicit one
	}

	public static TreeType getTreeType(String name, String color, String texture) {

		// return treeTypes.computeIfAbsent(name, key -> new TreeType(name, color, texture));
		 String key = name + "-" + color + "-" + texture;
		   if ( !treeTypes.containsKey(key)) {
			System.out.println("Creating a new TreeType for: " + key);
			treeTypes.put(key, new TreeType(name, color, texture));
		}
		return treeTypes.get(key);
	}
}
