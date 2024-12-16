
package com.ashishrai.design_patterns.behavioral.observer.edu;

import java.util.ArrayList;
import java.util.List;

import com.ashishrai.design_patterns.behavioral.observer.Observer;
import com.ashishrai.design_patterns.behavioral.observer.Subject;

public class EduApp implements Subject {

	private List<Observer> students = new ArrayList<>();
	private String topicName;

	public void setTopic(String topic) {

		this.topicName = topic;
		notifyObservers();
	}

	@Override
	public void register(Observer observer) {

		students.add(observer);
	}

	@Override
	public void unregister(Observer observer) {

		students.remove(observer);
	}

	@Override
	public void notifyObservers() {

		students.forEach(student -> student.update(topicName));
	}
}
