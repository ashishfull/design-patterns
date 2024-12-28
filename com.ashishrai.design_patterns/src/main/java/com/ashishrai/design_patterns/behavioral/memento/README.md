# 📝 Memento Design Pattern  

## 🌟 Overview  
The **Memento Design Pattern** allows you to save and restore an object's state without exposing its internal details. This is particularly useful for implementing **undo/redo** functionality in applications like text editors, drawing software, and games.  

In this project, we demonstrate the **Memento Design Pattern** with a **Text Editor** that supports:  
- Appending text  
- Undoing changes  
- Redoing undone changes  

---

## 🏗️ Components  
1. **Memento**: Stores the state of the text.  
2. **Originator (TextEditor)**: Creates and restores mementos.  
3. **Caretaker (History)**: Manages the undo/redo stacks.  

---

## 🔍 Key Features  
- Save the state of the editor at any point.  
- Undo changes to return to a previous state.  
- Redo changes to reapply undone actions.  

---

## 🚀 Usage  
- **Add Text**: Use `appendText()` to add new content to the editor.  
- **Save State**: Call `saveState()` to store the current content.  
- **Undo/Redo**: Use `undo()` and `redo()` to navigate through the state history.  

---

## ✨ Example  

### Initial State  
`Hello` → Save State  
`Hello World!` → Save State  

### Undo  
`Hello`  

### Redo  
`Hello World!`  

### Erase and Save  
`Hello`  

### Undo Again  
`Hello World!`  

---

## 💡 Real-World Applications  
- **Text Editors**: Undo/Redo functionality.  
- **Graphics Software**: Reverting to a previous design state.  
- **Games**: Save/Load progress features.  
- **Document Processing**: Version control for document changes.  

---

🌟 Explore the **Memento Design Pattern** and see how it can simplify state management in your applications!  
