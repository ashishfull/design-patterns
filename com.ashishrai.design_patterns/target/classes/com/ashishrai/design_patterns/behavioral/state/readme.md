# State Design Pattern

## 🧠 Introduction
The **State Design Pattern** allows an object to alter its behavior when its internal state changes. It encapsulates state-specific behavior into separate classes, providing cleaner and more modular code.

This pattern is particularly useful when an object needs to exhibit different behaviors based on its current state, and managing those behaviors directly within the object would result in messy and tightly coupled code.

---

## 🛠️ Where Can It Be Applied?
➡️ Delivery status tracking in e-commerce systems.
➡️ Job application process with various stages like applied, shortlisted, interviewed, and selected.
➡️ Media players handling states like playing, paused, and stopped.
➡️ Workflow automation systems.

---

## 🚚 Delivery Status Example
### Description:
A delivery can be in one of the following states:
- Order Placed
- Dispatched
- In Transit
- Delivered

Each state has specific behavior, like notifying the customer about the current status.  
The states are implemented as separate classes, and the context (Delivery) delegates the behavior to the current state.

### How It Works:
- `DeliveryContext`: The main class that represents the delivery and delegates behavior to the current state.
- `State`: An interface that defines the behavior for each state.
- `OrderPlacedState`, `DispatchedState`, `InTransitState`, `DeliveredState`: Concrete implementations of the `State` interface, encapsulating behavior for each specific state.

---

## 🏢 Job Onboarding Example
### Description:
A job application can transition through different states:
1. Application in Progress
2. Shortlisted
3. Interviewing in Progress
4. Selected

Each state represents a specific phase in the onboarding process, and the behavior (like notifying the applicant) changes depending on the current state.

### How It Works:
- `JobApplicationContext`: Represents the context of a job application.
- `JobState`: An interface for defining behavior specific to each application state.
- `InProgressState`, `ShortlistedState`, `InterviewingState`, `SelectedState`: Concrete classes implementing the `JobState` interface.

---

## 🚀 Benefits of Using State Design Pattern:
➡️ Promotes clean and maintainable code by encapsulating state-specific behavior.  
➡️ Reduces complexity by removing state-related conditionals in the main class.  
➡️ Makes it easier to add new states without modifying existing ones.  

By leveraging the **State Design Pattern**, you can create systems that are modular, extensible, and easier to debug.
