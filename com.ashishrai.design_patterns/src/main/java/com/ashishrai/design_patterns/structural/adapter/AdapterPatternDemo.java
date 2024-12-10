package com.ashishrai.design_patterns.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
        // Indian Plug instance
        IndianPlug indianPlug = new IndianPlug(PlugType.INDIAN);

        // US Plug instance
        USPlug usPlug = new USPlug(PlugType.US);

        // Adapter 1: Indian Plug to US Socket
        System.out.println("Using Adapter 1 (Indian to US):");
        USSocket indianToUSAdapter = new IndianToUSAdapter(indianPlug);
        indianToUSAdapter.connectUSPlug(PlugType.INDIAN);

        // Adapter 2: US Plug to Indian Socket
        System.out.println("\nUsing Adapter 2 (US to Indian):");
        IndianSocket usToIndianAdapter = new USToIndianAdapter(usPlug);
        usToIndianAdapter.connectIndianPlug(PlugType.US);
	}

}
