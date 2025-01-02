# Strategy Design Pattern

### What is the Strategy Design Pattern?

- The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This allows the algorithm's behavior to be selected at runtime. The key idea is to decouple the implementation of a behavior (algorithm) from the object that uses it, promoting flexibility and reusability.

### Why do we need it?

Without the Strategy Pattern, an object might rely on hardcoded behavior or contain conditional logic (e.g., if-else or switch statements) to determine which algorithm to execute. This approach is:

- Difficult to maintain as new behaviors are added.
- Prone to violations of the Open/Closed Principle (the class should be open for extension but closed for modification).
- Lacking reusability since behaviors are tightly coupled with the class.
- By using the Strategy Pattern, we avoid these issues and promote cleaner, more modular code.

### Problem Context

Imagine you are building a Duck Simulator for a game:

- Each duck can quack, swim, and fly.
- Different ducks have different flying behaviors—some ducks can fly, others can’t, and some might fly differently (e.g., rocket-powered flight). 

If we handle this with inheritance, we might end up with:

- A massive Duck superclass.
- Lots of overridden methods or conditional checks for specific ducks.
- Difficulty in adding new behaviors or modifying existing ones without breaking existing functionality.

### Solution with Strategy Pattern

The Strategy Pattern solves this problem by:

- Defining a family of behaviors (e.g., FlyBehavior and QuackBehavior).
- Encapsulating these behaviors in separate classes (e.g., FlyWithWings, FlyNoWay, Quack, Squeak).
- Allowing each Duck object to delegate its behavior to the appropriate strategy object.
Example UML:

Duck (Context): Delegates flying and quacking behavior to respective strategies.
FlyBehavior (Strategy Interface): Implementations include flyable, unFlyable.
QuackBehavior (Strategy Interface): Implementations include canQuack, noQuack.


### Uses of the Strategy Pattern

- Promoting Flexibility: Change behavior dynamically at runtime (e.g., switch a duck from flying to grounded).
- Code Reusability: Encapsulated behaviors can be reused across different contexts.
- Adhering to SOLID Principles: Encourages the Single Responsibility Principle (each behavior class has one responsibility) and the Open/Closed Principle (new behaviors can be added without modifying existing code).
- Simplifying Maintenance: Removing conditional logic simplifies understanding and extending the codebase.
