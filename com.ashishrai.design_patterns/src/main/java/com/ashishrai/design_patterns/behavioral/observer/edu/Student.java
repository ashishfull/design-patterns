
package com.ashishrai.design_patterns.behavioral.observer.edu;

import com.ashishrai.design_patterns.behavioral.observer.Observer;

public class Student implements Observer {

	private String name;

	public Student(String name) {

		this.name = name;
	}

	@Override
	public void update(String currentTopic) {

		System.out.println(String.format("%s is currently enrolled and started learning %s", name, currentTopic));
	}
}
