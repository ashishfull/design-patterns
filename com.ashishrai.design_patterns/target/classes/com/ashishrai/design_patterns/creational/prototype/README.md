# Prototype Design Pattern

## Overview

The **Prototype Design Pattern** is a creational pattern that allows cloning objects, providing a way to create new instances of an object by copying an existing one, rather than creating a new instance from scratch. This is particularly useful when creating an object is complex or costly.

There are different ways to implement the Prototype pattern, each serving different use cases. In this example, we'll explore three different approaches to implement the Prototype pattern:

1. **Shallow Cloning**
2. **Deep Cloning**
3. **Registry-Based Prototype**

---

## 1. Shallow Cloning

### Description
Shallow cloning creates a copy of an object, but the fields in the object are not deeply cloned. Instead, it copies references to the original objects. This can lead to shared mutable state between the original object and the clone, as changes to referenced objects affect both the original and cloned instances.

### Use Case
Shallow cloning is useful when the cloned object doesn't need to independently maintain a separate state for all nested objects, and when objects are relatively simple or immutable.

### Pros
- Faster than deep cloning as it does not require recursively copying nested objects.
- Suitable for objects with primitive fields or immutable objects.

### Cons
- The clone may inadvertently share references to mutable objects, leading to unintentional side-effects.
  
---

## 2. Deep Cloning

### Description
Deep cloning creates a copy of the object as well as all of the objects referenced by it. It recursively clones all the fields, which means the cloned object has its own copies of the referenced objects, thus avoiding shared references between the original and the cloned object.

### Use Case
Deep cloning is essential when an object contains mutable references, and each clone should operate independently without affecting the other.

### Pros
- Ensures that all referenced objects are independently cloned, maintaining complete isolation between the original and cloned object.
- Suitable when deep independence of state is required between original and clone.

### Cons
- Slower than shallow cloning due to the need to recursively clone nested objects.
- Can be more memory-intensive.

---

## 3. Registry-Based Prototype

### Description
In a Registry-based approach, a registry holds references to the prototypes of various objects. The prototypes can be cloned by looking them up in the registry. This method decouples the creation of objects from the client code and allows for flexible and reusable object creation.

### Use Case
Registry-based cloning is helpful when you want to manage a set of object prototypes and instantiate them based on some client request, allowing a more dynamic approach to object creation.

### Pros
- Allows for centralized management of object prototypes.
- Great for when object creation is complex and needs to be controlled.

### Cons
- Can become complicated when managing large numbers of prototypes.
- Slightly more overhead than simple cloning due to registry management.

---

## Test Class

In the test class, we have demonstrated the use of the three approaches mentioned above (Shallow Cloning, Deep Cloning, and Registry-Based Prototype). Each approach is tested for its ability to create copies of objects with distinct behaviors, showcasing how the Prototype pattern can be implemented in different scenarios.

---

## Conclusion

The Prototype Design Pattern provides an effective way to create new objects by cloning existing ones, reducing the need to build new instances from scratch. Choosing between shallow cloning, deep cloning, and registry-based prototypes depends on the use case, complexity of the objects, and the need for object independence.

- Use **Shallow Cloning** when performance is crucial and the object graph does not require deep independence.
- Opt for **Deep Cloning** when you need full isolation of objects and their references.
- Consider **Registry-Based Prototype** when managing multiple object prototypes in a centralized manner.
