# Mediator Design Pattern - Air Traffic Control System Example ✈️

The Mediator Design Pattern facilitates communication between multiple objects (aircraft in our case) through a central mediator (air traffic control), promoting loose coupling and reducing direct dependencies between components. In this example, aircrafts don’t communicate with each other directly. Instead, they communicate through the air traffic control system.

## Problem
In systems where multiple components interact, managing the communication between them can become complex. The Mediator pattern helps simplify communication by centralizing the interaction logic in a mediator, which decouples the components.

## Solution
In the context of an air traffic control system, aircraft (colleagues) send messages to and receive messages from an Air Traffic Control Tower (mediator). This keeps the aircraft independent from each other, and the Air Traffic Control Tower manages the flow of communication.

## Example Explained

- **Mediator Interface**: Defines methods for communication between aircraft.
- **Concrete Mediator (AirTrafficControl)**: Implements the communication logic and keeps a list of registered aircraft.
- **Aircraft (Colleague)**: Represents an abstract aircraft class that interacts with the mediator to send and receive messages.
- **Concrete Aircraft (PassengerPlane, CargoPlane)**: Concrete implementations of specific aircraft that send and receive messages through the mediator.

## Code Walkthrough
The `AirTrafficControl` interface is implemented by `AirTrafficController`, which keeps track of all registered aircraft. Each `Aircraft` class (e.g., `PassengerPlane`, `CargoPlane`) sends and receives messages via the `AirTrafficControl` mediator.

### Key Points:
- **Loose Coupling**: Aircrafts do not need to know about each other, only about the mediator.
- **Centralized Communication**: All messages are relayed through the mediator.

## Usage

1. Create an instance of `AirTrafficControl` (e.g., `AirTrafficController`).
2. Register multiple aircraft (e.g., `PassengerPlane`, `CargoPlane`).
3. Aircraft communicate by sending messages to the mediator.

## Example Output:
```plaintext
PassengerPlane A sending message: Requesting permission to land.
PassengerPlane B received message: Requesting permission to land.
CargoPlane C received message: Requesting permission to land.
-----------------------------------
CargoPlane C sending message: Requesting permission to take off.
PassengerPlane A received message: Requesting permission to take off.
PassengerPlane B received message: Requesting permission to take off.
