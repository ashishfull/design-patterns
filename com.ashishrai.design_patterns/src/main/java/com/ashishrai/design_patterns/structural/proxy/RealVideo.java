package com.ashishrai.design_patterns.structural.proxy;

public class RealVideo implements Video {
	
	private String videoName;
	
	public RealVideo(String videoName) {
		this.videoName = videoName;
		loadFromDisk();
	}
	
	private void loadFromDisk() {
		System.out.println(String.format("%s video has been loaded! Call play!", this.videoName));
	}
	
	@Override
	public void play() {
		System.out.println("Playing video: " + videoName);
	}

}
