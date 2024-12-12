package com.ashishrai.design_patterns.structural.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		Video video1 = new ProxyVideo("DesignPatterns.mp4");
		Video video2 = new ProxyVideo("ProxyPatternTutorial.mp4");

		System.out.println("\n--- First Play ---");
		video1.play();

		System.out.println("\n--- Second Play (Cached) ---");
		video1.play();

		System.out.println("\n--- Playing Another Video ---");
		video2.play();
	}

}
