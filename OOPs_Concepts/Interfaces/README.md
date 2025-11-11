# OOPs – Interfaces in Java

**Interface** in Java is a reference type that defines a set of abstract methods that any implementing class must define.  
It is used to achieve **abstraction** and **multiple inheritance** in Java.

---

## 💡 Concept Overview

In this example, the `Laptop` interface defines a few basic operations (`copy`, `paste`, `cut`, `keyboard`, and `mouse`).  
Three classes — `Lenovo`, `HP`, and `Apple` — implement this interface and provide their own unique versions of these methods.  
Additionally, each brand class includes its own extra features like `capture()` or `Printers()`.

---

## 👨‍💻 Classes Overview

| Class / Interface | Type        | Method(s)                                | Description |
|--------------------|-------------|------------------------------------------|--------------|
| `Laptop`           | Interface   | `copy()`, `paste()`, `cut()`, `keyboard()`, `mouse()` | Defines the contract for all laptop operations |
| `Lenovo`           | Class       | Implements all Laptop methods + `capture()` | Represents Lenovo-specific functionality |
| `HP`               | Class       | Implements all Laptop methods + `Printers()` | Adds printing capability |
| `Apple`            | Class       | Implements all Laptop methods | Represents Apple laptop implementation |
| `User`             | Class       | `main()` | Executes and demonstrates all class behaviors |

---

## 🧠 Concepts Demonstrated

- **Abstraction** using interfaces
- **Polymorphism** — same method names with different implementations
- **Code Reusability** through interface contracts
- **Encapsulation of brand-specific logic** inside each class

---

## 🏃 How to Run

1. Open `User.java` in IntelliJ IDEA
2. Run the `main()` method
3. You’ll see output demonstrating how each class implements the same interface differently.

---


