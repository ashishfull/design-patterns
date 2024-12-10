package com.ashishrai.design_patterns.structural.adapter;

public class USToIndianAdapter implements IndianSocket {

	private USPlug usPlug;

	public USToIndianAdapter(USPlug usPlug) {
		this.usPlug = usPlug;
	}

	@Override
	public void connectIndianPlug(PlugType plugType) {
		if(usPlug.getUSPlugType().equals(PlugType.US)) {
			System.out.println("Adapting US plug to fit Indian socket.");
			System.out.println("Connected " + plugType + " plug successfully to Indian socket!");
		} else {
			System.out.println("Incompatible plug type for Indian Socket!");
		}
	}

}
