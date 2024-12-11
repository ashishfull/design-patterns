# Strategy Pattern

The **Strategy Pattern** is a behavioral design pattern that allows for selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern lets the algorithm vary independently from clients who use it.

---

## 🛠️ What is the Strategy Pattern?
The **Strategy Pattern** defines a family of algorithms and makes them interchangeable. It allows the client to choose an algorithm at runtime without altering the client or the algorithms themselves. It promotes flexibility, making the system easier to maintain and extend.

Instead of having multiple conditional statements (`if-else`) to switch behaviors, we can use the Strategy Pattern to define separate strategy classes for each behavior. The client can then choose the behavior at runtime by switching the strategy without modifying the code that uses the strategy.

---

## 🛠️ How It Works
1. **Strategy Interface**: Defines a common interface for all concrete strategies. It declares the method(s) that each strategy should implement.
2. **Concrete Strategies**: Implement the `Strategy` interface, providing different implementations of the behavior.
3. **Context Class**: Uses the strategy interface to operate, delegating the algorithm implementation to the chosen strategy.

---

## 🛠️ Pros
➡️ **Decouples code**: Clients don't need to know about the implementation details of the strategies.
➡️ **Easy to extend**: Adding new behaviors is straightforward since you only need to create a new strategy class.
➡️ **Maintainable code**: Reduces the complexity of conditional logic and enhances maintainability.

---

## 🛠️ Cons
❌ **Overhead**: May lead to an increase in the number of classes if many behaviors are added.
❌ **Learning curve**: Developers need to understand how to implement and use strategies.

---

## 🛠️ Common Use Cases
🛠️ **Payment processing**: Different payment methods such as credit card, PayPal, and Bitcoin.
🛠️ **Sorting algorithms**: Different algorithms like quicksort, mergesort, and bubblesort.
🛠️ **User interface customization**: Different rendering strategies for web pages or applications.

---

## 🛠️ Real-world Example
Consider a mobile game with different attack strategies: aggressive, defensive, or balanced. Each strategy could be implemented as a separate class with specific rules for calculating damage, defense, and other behavior-specific attributes. The game can switch between these strategies based on user input or in-game conditions.

---

## 🛠️ When to Use
- **When an application needs to change its behavior at runtime**.
- **When a class has multiple, distinct algorithms**.
- **To avoid large switch statements (`if-else`) or conditional logic**.
- **When different algorithms must be interchangeable and can be implemented independently**.

---

