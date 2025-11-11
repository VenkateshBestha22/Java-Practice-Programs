# 🚀Abstract Class 

- abstract keyword is used to declare an abstract class or method.

- Abstract classes can have constructors, variables, and concrete methods.

- You cannot create an object of an abstract class.

- A subclass must implement all abstract methods of its parent abstract class.

- Abstract classes are often used when you want to define common behavior but leave specific behavior to subclasses.

---

## 🎯 Goal

Learn advanced usage of:
- **Constructors in abstract classes**
- **Protected fields** (accessible by subclasses)
- **Abstract methods** (must be overridden)
- **Concrete methods** (shared implementations)

---

## 📂 Files & Classes Overview

| File | Type | Description |
|------|------|-------------|
| `Employee.java` | Abstract Class | Defines common fields (`name`, `salary`), a constructor, one abstract method `work()`, and one concrete method `showDetails()` |
| `Developer.java` | Subclass | Extends `Employee` and provides implementation for `work()` |
| `Manager.java` | Subclass | Extends `Employee` and provides its own version of `work()` |
| `Company.java` | Runner Class | Creates objects of subclasses and calls both abstract and concrete methods |

- This example demonstrates **advanced abstraction in Java** — combining constructors, protected fields, abstract methods, and concrete methods within an abstract class.  

- It shows how real-world roles like `Employee`, `Developer`, and `Manager` can share common properties while enforcing specific behavior in subclasses.
---
## 🧠 Key Concepts

- Abstract class can contain both abstract and non-abstract methods.

- Constructors in abstract classes initialize shared fields for all subclasses.

- Protected fields allow controlled access in child classes.

- Demonstrates real-world inheritance and polymorphism — one base type (Employee) with multiple specialized implementations (Developer, Manager).
