package com.ashishrai.design_patterns.structural.adapter;

public class IndianToUSAdapter implements USSocket {

	private IndianPlug indianPlug;

	public IndianToUSAdapter(IndianPlug indianPlug) {
		this.indianPlug = indianPlug;
	}

	@Override
	public void connectUSPlug(PlugType plugType) {
		if (indianPlug.getIndianPlugType().equals(PlugType.INDIAN)) {
			System.out.println("Adapting Indian plug to fit US socket.");
			System.out.println("Connected " + plugType + " plug successfully to US socket!");
		} else {
			System.out.println("Incompatible plug type for US socket!");
		}
	}

}
