package com.ashishrai.design_patterns.structural.adapter;

public class IndianPlug  {
	
	private PlugType plugType;

	public IndianPlug(PlugType plugType) {
		this.plugType = plugType;
	}

	public PlugType getIndianPlugType() {
		return plugType;
	}
	


}
