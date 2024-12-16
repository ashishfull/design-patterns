
package com.ashishrai.design_patterns.behavioral.observer.news;

import java.util.ArrayList;
import java.util.List;

import com.ashishrai.design_patterns.behavioral.observer.Observer;
import com.ashishrai.design_patterns.behavioral.observer.Subject;

public class NewsAgency implements Subject {

	private List<Observer> subscribers = new ArrayList<>();
	private String latestNews;

	public void setLatestNews(String news) {

		this.latestNews = news;
		notifyObservers(); // Notify all subscribers when news is updated
	}

	@Override
	public void register(Observer observer) {

		subscribers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {

		subscribers.remove(observer);
	}

	@Override
	public void notifyObservers() {

		for (Observer observer : subscribers) {
			observer.update(latestNews);
		}
	}
}
