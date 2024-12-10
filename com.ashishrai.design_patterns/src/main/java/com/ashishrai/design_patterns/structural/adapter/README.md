# Adapter Design Pattern: Plug Adapter

## Overview
The **Adapter Design Pattern** is a structural pattern used to enable communication between objects with incompatible interfaces. It acts as a bridge between two incompatible interfaces, making them compatible. This pattern is particularly useful when working with existing classes that have fixed interfaces. It allows you to integrate them into a new context or framework that expects a different interface. The Adapter pattern facilitates code reuse and system integration by bridging systems that otherwise could not work together due to their differing interfaces. In the context of plug adapters, it enables Indian plugs to connect to US sockets and vice versa, adapting one plug type to the compatible socket type.

## Key Features
- 🌐 **Incremental Construction**: Allows building objects step-by-step without a telescoping constructor.
- 🔒 **Immutability**: Ensures the object is immutable after construction.
- 📖 **Readable Code**: Improves code readability and maintainability using method chaining.

## How It Works
1. **Adaptee**: An existing class (or objects) that has a specific interface which needs to be adapted. In our example, this would be the `IndianPlug` and `USPlug` classes.
2. **Adapter**: A new class that wraps the adaptee and translates its interface into one that can be used by the target class. For instance, `IndianToUSAdapter` adapts the Indian plug to the US socket.
3. **Target**: The desired interface that the system expects. Here, it is the `USSocket` interface that requires compatibility with both `INDIAN` and `US` plug types.

## Pros
- 🔄 **Separation of Concerns**: The adapter isolates the compatibility logic, keeping the main logic clean and decoupled from the adaptation process. This makes the code more maintainable.
- 🔄 **Code Reusability**: The adapter can be reused to adapt different plug types to sockets in various scenarios, enhancing the flexibility of the system.
- 📈 **Improved Readability**: Using well-defined interfaces makes the code easier to understand and maintain, reducing potential errors and bugs.

## Cons
- ❗ **Limited Flexibility**: The unidirectional nature of the adapter restricts its use to specific plug/socket combinations. Adapting only one way (Indian to US or US to Indian) limits its general applicability.
- ❌ **Incompatibility Issues**: If the plug type is not correctly verified or if the adapter doesn’t properly handle the translation, it may lead to connection failures.

## Common Use Cases
- 🌍 **International Travel**: Adapting Indian plugs for use with US sockets.
- 🌐 **Different Regional Standards**: Adapting plug types for different socket interfaces to accommodate varying regional standards. This is especially useful for travelers, as plug adapters are commonly used to fit devices across different countries.
- 🚀 **Legacy System Integration**: Adapting older systems with outdated interfaces to work with modern systems expecting a different standard.

## Real-World Examples
- 🌏 **International Travel**: Using plug adapters to adapt Indian plugs to fit US sockets, allowing electronic devices to be used across different countries.
- 🚗 **Automobile Manufacturing**: Cars with plug-in chargers that require adapters to fit different regional socket types.
- 🎒 **Travel Accessories**: Universal plug adapters for various devices like laptops, cameras, and chargers that need to be used internationally.

## When to Use
- 📐 **Complex Objects**: When the object has a large number of attributes, especially optional ones.
- 📖 **Readable APIs**: When you want to offer a fluent and user-friendly way to build objects.
- 🚫 **Avoid Constructor Overloading**: When you need to avoid cluttering the class with multiple constructors for different configurations.

## Conclusion
By utilizing the Adapter Design Pattern, you can ensure that your code is clean, maintainable, and adaptable to changes in the object's structure.
