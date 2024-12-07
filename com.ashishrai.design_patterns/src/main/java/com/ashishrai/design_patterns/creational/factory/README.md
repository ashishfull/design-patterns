## Factory Design Pattern in Java

### Overview
The **Factory Design Pattern** is a creational pattern used to create objects without specifying the exact class of object that will be created. This pattern introduces a `factory` class which is responsible for creating instances of various classes by using a common interface or superclass. The factory design pattern provides a way to delegate object creation to a factory class, promoting loose coupling and making the code more maintainable.

### Key Concepts
- **Factory Class**: Responsible for creating objects. It abstracts the instantiation logic.
- **Product**: The objects created by the factory.
- **Client**: A component that consumes the product created by the factory.

### Why Use Factory Design Pattern?
- 🌐 **Promotes Loose Coupling**: Client code does not need to know the details of how objects are created.
- 🔄 **Easy to Maintain**: Adding new products or changing the implementation of the factory does not affect the client code.
- 🏗️ **Centralized Object Creation**: Helps in controlling the way objects are created, allowing for easy changes if the creation process needs to change.

### Implementation Options
1. **Simple Factory**: The factory method creates one of several product classes based on input parameters. It is simple but does not scale well.
2. **Factory Method**: Each subclass of the factory declares an interface for creating a product, but the factory decides which class to instantiate. It's more flexible and scales well.
3. **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Example Code
- For detailed implementation, pros, cons of each approach, and when to use them, check out the code in the repository.

### How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/ashishfull/design-patterns.git
    ```
2. Navigate to the project directory:
   ```bash
   cd design-patterns
   ```
3. Run the examples using your preferred Java IDE or from the command line:
  ```bash
    java -cp path/to/classes com.ashishrai.design_patterns.Main
  ```

### Conclusion
The Factory Design Pattern is a powerful pattern that promotes the separation of concerns and makes object creation more manageable. By using different factory methods, it becomes easy to create different products without coupling the client code directly with the implementation. This pattern is particularly useful when the creation of an object is independent of its components and allows easy maintenance and scalability.
💬 Have any questions or thoughts about the Factory Design Pattern? Let’s discuss!
