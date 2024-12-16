
package com.ashishrai.design_patterns.behavioral.observer.news;

import com.ashishrai.design_patterns.behavioral.observer.Observer;

public class Subscriber implements Observer {

	private String name;

	public Subscriber(String name) {

		this.name = name;
	}

	@Override
	public void update(String news) {

		System.out.println(name + " received news update: " + news);
	}
}
