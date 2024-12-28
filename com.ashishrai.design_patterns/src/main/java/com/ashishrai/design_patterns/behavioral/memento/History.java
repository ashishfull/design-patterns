package com.ashishrai.design_patterns.behavioral.memento;

//Caretaker: Manages Memento Stack
import java.util.Stack;

public class History {
	private final Stack<Memento> undoStack = new Stack<>();
	private final Stack<Memento> redoStack = new Stack<>();

	public void saveState(Memento memento) {
		undoStack.push(memento);
		redoStack.clear(); // Clear redo stack on new action
	}

	public Memento undo() {
		if (!undoStack.isEmpty()) {
			Memento memento = undoStack.pop();
			redoStack.push(memento);
			return undoStack.isEmpty() ? null : undoStack.peek();
		}
		return null;
	}

	public Memento redo() {
		if (!redoStack.isEmpty()) {
			Memento memento = redoStack.pop();
			undoStack.push(memento);
			return memento;
		}
		return null;
	}
}
