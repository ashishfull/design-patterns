
package com.ashishrai.design_patterns.behavioral.observer.news;

import com.ashishrai.design_patterns.behavioral.observer.Observer;

public class NewsExampleTest {

	public static void main(String[] args) {

		NewsAgency agency = new NewsAgency();
		Observer alice = new Subscriber("Alice");
		Observer bob = new Subscriber("Bob");
		Observer charlie = new Subscriber("Charlie");
		// Subscribers register themselves
		agency.register(alice);
		agency.register(bob);
		// Breaking news!
		agency.setLatestNews("Breaking News: Observer Pattern Simplified!");
		// Charlie subscribes later
		agency.register(charlie);
		// Another news update
		agency.setLatestNews("Update: Java Design Patterns Made Easy!");
		// Bob unsubscribes
		agency.unregister(bob);
		// Final news update
		agency.setLatestNews("Final Update: Mastering Observer Pattern!");
	}
}
