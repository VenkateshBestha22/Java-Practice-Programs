# OOPs
what is the **OOP** : OOP **(Object-Oriented Programming)** is a Programming paradigm based on the concepts of objects 


**Class** : it`s a user which defines its properties & its functions , It`s a **blueprint** for creating objects.

**Object** : Object is an **Instance** of class

# **Four Pillars of Java**
## Inheritance in Java
This folder contains a practical example of **multilevel inheritance** in Java using a simple role-based hierarchy: `Guest → Developer → Admin`.

## 👨‍💻 Classes Overview

| Class     | Inherits From | Method(s)         | Description                          |
|-----------|----------------|-------------------|--------------------------------------|
| `Guest`   | —              | `read()`          | Base class with read functionality   |
| `Developer` | `Guest`      | `write()`         | Extends `Guest` and adds write logic |
| `Admin`   | `Developer`    | `manage()`        | Extends `Developer` with manage logic|
| `User`    | —              | `main()`          | Demonstrates object creation and method calls |

## 🧠 Concepts Demonstrated

- **Multilevel Inheritance**: `Admin` inherits from `Developer`, which inherits from `Guest`
- **Method Access via Inheritance**: Each subclass can access methods from its parent
- **Object Instantiation**: Shows how different roles behave using their own and inherited methods

## 🏃 How to Run

1. Open `User.java` in IntelliJ IDEA
2. Run the `main()` method
3. Output will demonstrate method calls from each class: