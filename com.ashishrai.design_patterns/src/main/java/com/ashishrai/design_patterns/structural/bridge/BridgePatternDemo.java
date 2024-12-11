
package com.ashishrai.design_patterns.structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {

		//
		Device tv = new TV();
		//
		RemoteControl basicRemoteForTV = new BasicRemoteControl(tv);
		AdvancedRemoteControl advancedRemoteForTV = new AdvancedRemoteControl(tv);
		//
		basicRemoteForTV.tunrOn();
		basicRemoteForTV.tunrOff();
		System.out.println("-----------------------------------------");
		//
		advancedRemoteForTV.tunrOn();
		advancedRemoteForTV.setVolume(75);
		advancedRemoteForTV.tunrOff();
		System.out.println("-----------------------------------------");
		/*
		 * 
		 */
		//
		Device musicSystem = new MusicPlayer();
		//
		RemoteControl basicRemoteForMusic = new BasicRemoteControl(musicSystem);
		AdvancedRemoteControl advancedRemoteForMusic = new AdvancedRemoteControl(musicSystem);
		//
		basicRemoteForMusic.tunrOn();
		basicRemoteForMusic.tunrOff();
		System.out.println("-----------------------------------------");
		//
		advancedRemoteForMusic.tunrOn();
		advancedRemoteForMusic.setVolume(120);
		advancedRemoteForMusic.tunrOff();
	}
}
