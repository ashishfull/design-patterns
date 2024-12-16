
package com.ashishrai.design_patterns.behavioral.observer;

public interface Subject {

	void register(Observer observer);

	void unregister(Observer observer);

	void notifyObservers();
}
