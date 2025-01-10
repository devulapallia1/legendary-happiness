# University Management System

A Java-based project to manage various entities in a university, including students, professors, departments, and the overall university structure. This project demonstrates object-oriented programming (OOP) principles such as inheritance, encapsulation, and polymorphism.

## Features

- **University**: Represents the university as a whole, containing departments and other high-level information.
- **Department**: Represents individual departments within the university, holding information about students and professors.
- **Person**: A base class for shared attributes and behaviors of `Student` and `Professor` classes.
- **Student**: Represents a student entity with specific attributes like student ID, courses, and grades.
- **Professor**: Represents a professor entity with attributes like employee ID, specialization, and courses taught.

## Files in the Project

### 1. `University.java`
Contains the implementation of the `University` class, managing departments and providing functionality to oversee the university's operations.

### 2. `Department.java`
Defines the `Department` class, managing students, professors, and department-specific data.

### 3. `Person.java`
Defines the base class for all people in the university system, including common attributes such as name, age, and address.

### 4. `Student.java`
Extends the `Person` class and includes attributes and methods specific to students, such as managing their courses and grades.

### 5. `Professor.java`
Extends the `Person` class and includes attributes and methods specific to professors, such as managing the courses they teach and their specializations.

### 6. `Main.java`
The entry point for the program. It initializes the university system, populates data, and demonstrates the functionality of the classes.

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd university-management-system
   ```

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the program:
   ```bash
   java Main
   ```

## Project Structure
```
|-- University.java
|-- Department.java
|-- Person.java
|-- Student.java
|-- Professor.java
|-- Main.java
```

## Technologies Used
- **Programming Language**: Java
- **Development Environment**: Any Java-compatible IDE or command line

## Concepts Demonstrated
- Object-Oriented Programming (OOP)
  - Inheritance
  - Encapsulation
  - Polymorphism
  - Abstraction
- Java collections for managing lists of entities

## Future Enhancements
- Add GUI support for better user interaction.
- Implement a database for persistent storage.
- Add more detailed reporting and analytics features.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for improvements.
---
Happy coding!
