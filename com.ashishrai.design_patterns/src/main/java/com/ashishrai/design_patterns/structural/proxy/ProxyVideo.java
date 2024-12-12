package com.ashishrai.design_patterns.structural.proxy;

public class ProxyVideo implements Video {

	private String videoName;
	private RealVideo realVideo;

	public ProxyVideo(String videoName) {
		this.videoName = videoName;
	}

	@Override
	public void play() {
		if (realVideo == null) {
			System.out.println("Proxy: Delegating to RealVideo...");
			realVideo = new RealVideo(videoName); // Lazy initialization
		}
		realVideo.play();
	}

}
