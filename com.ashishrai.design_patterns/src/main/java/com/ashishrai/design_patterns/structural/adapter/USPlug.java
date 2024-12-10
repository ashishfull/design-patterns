package com.ashishrai.design_patterns.structural.adapter;

public class USPlug {
	
	private PlugType plugType;

	public USPlug(PlugType plugType) {
		this.plugType = plugType;
	}

	public PlugType getUSPlugType() {
		return plugType;
	}

}
