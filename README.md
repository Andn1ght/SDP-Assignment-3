# Database Adapter Example

This project is a Java example illustrating the Adapter design pattern in the context of database adapters. It demonstrates how to use the Adapter pattern to make two different database systems (MySQL and MongoDB) work together in a hypothetical software application. The project showcases not only the Adapter pattern but also the implementation of software engineering principles such as SOLID, KISS, and DRY.

## Table of Contents

- [Project Structure](#project-structure)
- [Adapter Pattern](#adapter-pattern)
- [SOLID Principles Implementation](#solid-principles-implementation)

## Project Structure

The project is organized into several Java classes and packages:

- `adapters`: This package contains the adapter classes, such as `DatabaseAdapter`, `MySQLAdapter`, and `MongoDBAdapter`.
- `databases`: This package includes the classes representing the database systems, e.g., `MySQLDatabase` and `MongoDBDatabase`.
- `Main.java`: This is the main application class where you can instantiate and use the adapters.

## Adapter Pattern

This project is a demonstration of the Adapter design pattern, a structural pattern that allows objects with incompatible interfaces to collaborate. In this context, the adapters (e.g., `MySQLAdapter` and `MongoDBAdapter`) act as bridges between the target interface (`DatabaseAdapter`) and the adaptees (MySQL and MongoDB databases). The Adapter pattern simplifies the process of integrating different database systems into a single application, making the code more flexible and maintainable.

## SOLID Principles Implementation

This project adheres to software engineering principles known as SOLID, which help create clean, maintainable code. Let's explain each SOLID principle in simple terms:

- **Single Responsibility Principle (SRP)**: Each part of the code should have one specific job, just like each tool in a toolbox has a unique purpose.

- **Open-Closed Principle (OCP)**: Software should be like a book that's open for reading but closed for changes. It allows us to add new features without rewriting existing code.

- **Liskov Substitution Principle (LSP)**: If something looks, acts, and fits like a car, it should be treated as a car. In code, it means that new parts of the program should fit seamlessly with the old ones.

- **Interface Segregation Principle (ISP)**: Think of a remote control with many buttons. It should only force you to use the buttons you need, not all of them.

- **Dependency Inversion Principle (DIP)**: Software should be like a light switch that doesn't care where the electricity comes from. It promotes relying on abstract ideas rather than specific implementations, making your code more flexible.
