package com.ashishrai.design_patterns.behavioral.memento;

//Client: Using the Memento Pattern
public class MementoPatternDemo {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		History history = new History();

		// Initial State
		editor.appendText("Hello");
		history.saveState(editor.save());

		editor.appendText(" World!");
		history.saveState(editor.save());

		System.out.println("Current Content: " + editor.getContent()); // Hello World!

		// Undo
		editor.restore(history.undo());
		System.out.println("After Undo: " + editor.getContent()); // Hello

		// Redo
		editor.restore(history.redo());
		System.out.println("After Redo: " + editor.getContent()); // Hello World!

		// Erase and Save
		editor.eraseLast(6);
		history.saveState(editor.save());
		System.out.println("After Erase: " + editor.getContent()); // Hello

		// Another Undo
		editor.restore(history.undo());
		System.out.println("Final State After Undo: " + editor.getContent()); // Hello World!
	}
}
