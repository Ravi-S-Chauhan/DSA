# Factory Method Pattern

- The Factory Method Pattern is a creational design pattern that defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. It relies on subclasses to decide which concrete class to instantiate.

### Key Concepts
- Instead of calling a constructor directly, client code calls a factory method to create objects.
- This allows the client code to depend on an interface or abstract class rather than concrete classes.
- Abstract Factory Class/Interface:
- The factory method is often abstract in a base class or interface, forcing subclasses to provide their specific implementation.

### Why Do We Need the Factory Method Pattern?
1. Decouples Code from Concrete Implementations
   - The client code depends only on the abstract type (interface or base class), not on the concrete implementation. This makes the code more flexible and easier to change.
2. Follows the Open/Closed Principle
   - Adding new product types does not require modifying existing client code, only creating a new subclass that implements the factory method.
3. Encapsulates Object Creation Logic
   - Object creation logic is centralized in the factory method, making the code easier to maintain.
4. Promotes Consistent Object Creation
    - Ensures that related objects are created consistently.

### When Do We Need the Factory Method Pattern?
1. When a class cannot anticipate the type of objects it needs to create. 
    - Example: A graphical editor creating different shapes like circles, squares, or triangles based on user input.
2. When object creation needs to be delegated to subclasses.
   - Example: Creating different types of documents (PDF, Word) in an application.
3. When the exact type of the object is determined at runtime.
   - Example: A logging framework that creates different loggers based on configuration (console logger, file logger, etc.).

### How is it Different from the Simple Factory Method?
```text
| **Aspect**               | **Simple Factory**                                                                 | **Factory Method**                                                                                   |
|---------------------------|-------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| **Definition**            | Centralizes object creation logic in one place (a single factory class).            | Relies on subclasses to provide specific implementations for object creation.                      |
| **Flexibility**           | Less flexible; adding new types may require changes in the factory class.           | More flexible; adding new types only requires creating a new subclass.                             |
| **Design Pattern Status** | Not a formal design pattern (considered a programming idiom).                       | A formal design pattern in the Gang of Four patterns.                                              |
| **Encapsulation**         | Encapsulates object creation logic in one place but may violate the open/closed principle. | Follows the open/closed principle by delegating object creation to subclasses.              |
| **Inheritance**           | Does not use inheritance; the factory class contains all the logic.                 | Makes heavy use of inheritance; subclasses override the factory method.                            |
| **Scalability**           | Less scalable for large applications with many product types.                       | More scalable as it naturally supports extensibility.                                              |
```
