package com.ashishrai.design_patterns.creational.factory;

public class Bike implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing Bike...");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bike...");
    }
}
