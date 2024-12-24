# Command Pattern - Banking System Transaction Example

## Overview

In this example, we implement the **Command Design Pattern** to simulate a banking system. The Command Pattern is used to encapsulate requests or simple operations as objects, allowing us to parameterize clients with queues, requests, and operations. It also supports undo functionality for operations.

### Problem:
In a typical banking system, operations like **Deposit** and **Withdraw** need to be executed on a bank account. These operations are encapsulated as commands to promote flexibility and maintainability.

## Structure

- **TransactionCommand** (Command Interface): This interface defines the `execute()` and `undo()` methods for concrete command implementations.
- **DepositCommand** (Concrete Command): Implements the `TransactionCommand` interface, encapsulating the logic for depositing money.
- **WithdrawCommand** (Concrete Command): Implements the `TransactionCommand` interface, encapsulating the logic for withdrawing money.
- **BankAccount** (Receiver): The receiver class that holds the actual business logic for deposit and withdrawal operations.
- **TransactionInvoker** (Invoker): This class is responsible for executing and undoing commands.

## Flow

1. The `TransactionInvoker` takes a `TransactionCommand` object (like `DepositCommand` or `WithdrawCommand`).
2. The command object encapsulates the action of deposit or withdrawal on the `BankAccount`.
3. The command is executed using the `executeCommand()` method of the invoker.
4. An undo feature is also available by calling the `undoCommand()` method of the invoker.

## Benefits

- **Encapsulation**: Commands encapsulate the logic for various operations (e.g., deposit, withdrawal) into separate objects.
- **Flexibility**: Adding new operations doesn't require changing existing code; you can add new command classes instead.
- **Undo Support**: The system supports undo functionality for each operation, providing a better user experience in banking transactions.
- **Separation of Concerns**: The `BankAccount` class focuses on the business logic, while commands handle operations.

## Usage

1. Create a `BankAccount` instance with an initial balance.
2. Create command objects like `DepositCommand` and `WithdrawCommand`, passing the `BankAccount` instance and the amount.
3. Set the command for the `TransactionInvoker` and execute it using the `executeCommand()` method.
4. Optionally, use the `undoCommand()` method to revert the last executed operation.

### Output
The output demonstrates the effect of executing commands like deposit and withdrawal. For example, after executing a deposit command, the balance will reflect the added amount, and similarly for withdrawal.

## Conclusion

The Command Pattern in this example helps separate the concerns of the banking system. Operations are encapsulated as independent objects that can be executed and undone dynamically. It promotes scalability and maintains a clean codebase, making it easy to add new operations in the future.

## Future Enhancements

- Add more banking operations (e.g., transfer, check balance).
- Implement more complex undo/redo functionality with a history stack.
- Support multiple accounts and different types of transactions.

---

## Related Concepts
- **Design Patterns**: Behavioral Patterns
- **Command Pattern**: Encapsulates requests as objects and decouples sender and receiver.

## Author
- Ashish Rai

