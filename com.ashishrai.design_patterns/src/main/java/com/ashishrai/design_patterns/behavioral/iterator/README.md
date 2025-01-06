# Iterator Design Pattern 🚀

The **Iterator Design Pattern** is a behavioral design pattern that allows sequential access to elements in a collection without exposing its underlying representation. This makes it easier to iterate over various collections in a unified manner.

---

## 🛠️ Key Components

1. **Iterator**  
   Defines methods for traversing a collection (`hasNext`, `next`).  

2. **Concrete Iterator**  
   Implements the `Iterator` interface to traverse a specific collection.  

3. **Collection**  
   Declares methods to manage and retrieve iterators for the collection.  

4. **Concrete Collection**  
   Implements the `Collection` interface and provides an iterator.

---

## 💡 Example: Employee Directory

We implemented an **Employee Directory** system to demonstrate the Iterator Design Pattern.

### **Classes**

- `Employee`: Represents an employee with attributes like name and department.
- `EmployeeIterator`: Interface for traversing through employees.
- `EmployeeListIterator`: Concrete implementation of the iterator for `EmployeeList`.
- `EmployeeCollection`: Interface for managing employee collections.
- `EmployeeList`: Concrete collection of employees implementing `EmployeeCollection`.

### **Flow**

1. The `EmployeeList` manages the collection of employees.
2. The `EmployeeListIterator` provides a way to traverse the list sequentially.
3. The client (`Main`) uses the iterator to access employee details without knowing the internal structure.

---

## 🔑 Advantages

- Simplifies traversal logic by separating it from the collection logic.
- Supports multiple traversal implementations.
- Works with various collection types (e.g., lists, sets).

---

## 🔍 Output
```bash
Employee Directory: Employee{name='Alice', department='HR'} Employee{name='Bob', department='IT'} Employee{name='Charlie', department='Finance'}
```
---

## 🔗 Related Patterns

- **Composite**: Often used with iterators to traverse a composite structure.  
- **Factory**: Can be used to create iterators.
