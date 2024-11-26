# Addressing SOLID Principles in a Pet Store System

This project demonstrates the application of SOLID design principles in a pet store management system. It highlights both violations and correct implementations of three key SOLID principles: Liskov Substitution Principle (LSP), Interface Segregation Principle (ISP), and Dependency Inversion Principle (DIP).

## Table of Contents
1. Project Overview
2. SOLID Principles Demonstrated
   - Liskov Substitution Principle (LSP)
   - Interface Segregation Principle (ISP)
   - Dependency Inversion Principle (DIP)
3. Use Case: Pet Store System
4. Project Structure
5. How to Run the Code

## Project Overview

This repository contains Java code that illustrates how SOLID principles can be applied to improve the design and maintainability of a pet store system. Each principle is demonstrated with both a violation example and a corrected implementation.

## SOLID Principles Demonstrated

### Liskov Substitution Principle (LSP)
- **Definition**: Subtypes must be substitutable for their base types without altering the correctness of the program.
- **Violation Example**: A Fish class that cannot make sounds, leading to exceptions when used as an Animal.
- **Solution**: Introduced an interface SoundMakingAnimal to ensure only animals that can make sounds implement it.

### Interface Segregation Principle (ISP)
- **Definition**: Clients should not be forced to depend on interfaces they do not use.
- **Violation Example**: A large PetCareService interface that includes methods irrelevant for certain pet types.
- **Solution**: Split the interface into smaller, more specific interfaces like FeedingService, WashingService, etc., allowing classes to implement only what they need.

### Dependency Inversion Principle (DIP)
- **Definition**: High-level modules should not depend on low-level modules; both should depend on abstractions.
- **Violation Example**: A PetStore class directly depending on a specific payment method (CreditCardPayment).
- **Solution**: Used an interface PaymentProcessor to allow different payment methods to be injected into PetStore.

## Use Case: Pet Store System

The project simulates a pet store management system with the following features:
- Managing pet data
- Processing payments through various methods
- Providing care services for different types of pets

This use case demonstrates how adhering to SOLID principles can lead to more flexible and maintainable code.

## Project Structure

Addressing_SOLID_Principles/
├── README.txt
├── Violated/
│   ├── LSP/
│   │   └── Animal.java
│   │   └── Cat.java
│   │   └── Fish.java
│   │   └── PetStore.java
│   ├── ISP/
│   │   └── PetCareService.java
│   │   └── DogCareService.java
│   │   └── FishCareService.java
│   └── DIP/
│       └── PetStore.java
│       └── CreditCardPayment.java
└── Solved/
├── LSP/
│   ├── Animal.java
│   ├── SoundMakingAnimal.java
│   ├── Cat.java
│   ├── Fish.java
│   └── PetStore.java
├── ISP/
│   ├── FeedingService.java
│   ├── WashingService.java
│   ├── GroomingService.java
│   └── DogCareService.java
│   └── FishCareService.java
└── DIP/
├── PaymentProcessor.java
├── CreditCardPayment.java
├── PayPalPayment.java
└── PetStore.java

Each principle folder contains relevant Java files demonstrating the principle's violation and solution.

## How to Run the Code

1. Clone the repository:
```
git clone https://github.com/yourusername/Addressing_SOLID_Principles.git
```

2. Navigate to a specific principle's folder:
```
cd Addressing_SOLID_Principles/Solved/LSP  # or ISP/DIP as needed
```

3. Compile and run the Java files:
```
javac *.java
java Main  # Adjust as necessary for each principle's main class.
```

4. Observe the output in the console demonstrating the functionality of the pet store system while adhering to SOLID principles.

## Conclusion

This project illustrates how applying SOLID principles can significantly improve code organization and maintainability in software development. By following these principles, developers can create systems that are easier to understand, extend, and modify.
s
