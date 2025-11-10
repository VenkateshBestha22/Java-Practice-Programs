# Encapsulation in Java

This folder demonstrates the concept of **Encapsulation** using a simple interaction between a `Student` and a `Teacher`.

Encapsulation is achieved by:
- Declaring fields as `private`
- Providing `public` getter and setter methods to access and modify those fields

## 👨‍🏫 Classes Overview

| Class     | Description |
|-----------|-------------|
| `Student` | Contains private fields (`rollNumber`, `name`, `isAttended`) and public methods to access and modify them |
| `Teacher` | Acts as a driver class to interact with `Student` and demonstrate encapsulated access |

## 🧠 Concepts Demonstrated

- **Encapsulation**: Data hiding using private fields
- **Controlled Access**: Public methods (`setStudentAttendence`, `getStudentAttendence`) manage access to internal state
- **Constructor Usage**: `Student` class uses a constructor to initialize `rollNumber`
- **Validation Logic**: Attendance can only be set once

## 🏃 How to Run

1. Open `Teacher.java` in IntelliJ IDEA
2. Run the `main()` method
3. Output will demonstrate encapsulated access: