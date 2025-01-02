# Simple Factory Method

### What is Factory method?
-> The Factory Method design pattern is used to create objects without specifying the exact class of the object that will be created. A simple factory method refers to an implementation where a factory class contains a single method responsible for creating and returning objects based on input parameters or logic.

It is not as flexible as the full Factory Method Pattern (where creation logic is often overridden by subclasses), but it's a simpler version that works well for straightforward use cases.

### Structure

```text
+----------------+
| Factory        |
|----------------|
| createProduct()| ---> Returns a product based on input
+----------------+
        |
        v
+------------------+
| ConcreteProductA | ---> The concrete classes the factory creates
+------------------+
+------------------+
| ConcreteProductB |
+------------------+

```

![ClassDiagramSimpleFactor](classDiagramSimpleFactory.png)

### Why do we need Simple Factory pattern?
1. Encapsulation of Object Creation Logic
2. Reduces Coupling
3. Simplifies Code Maintenance
4. Improves Code Readability
5. Handles Complex Creation Logic

### When Should You Use a Simple Factory Method?
1. When the object creation logic is complex and involves multiple steps.
2. When you expect changes in the way objects are created or new object types to be added.
3. When you want to reduce duplication of object creation code across your application.
4. When you want to decouple the client from the specific classes being instantiated.

### Characteristics of a Simple Factory
- It centralizes object creation.
- It typically uses a static method to return an instance of a class.
- It is not a formal design pattern but a programming convention.

### Problem Context

- You have a pizza store that can make different types of pizzas, such as CheesePizza, PepperoniPizza, and VeggiePizza. Instead of letting the pizza store handle the creation of pizzas directly, you use a simple factory to encapsulate the creation logic.
