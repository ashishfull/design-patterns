package com.ashishrai.design_patterns.behavioral.memento;

//Originator: The main Text Editor
public class TextEditor {
	private StringBuilder content = new StringBuilder();

	public void appendText(String text) {
		content.append(text);
	}

	public void eraseLast(int chars) {
		int length = content.length();
		if (chars <= length) {
			content.delete(length - chars, length);
		}
	}

	public String getContent() {
		return content.toString();
	}

	public Memento save() {
		return new Memento(content.toString());
	}

	public void restore(Memento memento) {
		content = new StringBuilder(memento.getState());
	}
}
