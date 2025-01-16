# Java Console-Based Quiz Application

## Overview
This is a simple console-based quiz application written in Java. The quiz focuses on Object-Oriented Programming (OOP) concepts in Java. Users can answer multiple-choice questions, receive feedback on their answers, and view their score at the end.

---

## Features
- **Dynamic Questions**: The quiz includes 20 multiple-choice questions on Java OOP concepts.
- **Interactive Console**: Users answer questions via the console and get instant feedback.
- **Score Calculation**: The application calculates and displays the final score.
- **Clean and Modular Code**: The project follows OOP principles for better readability and maintainability.

---

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or later.
- **IDE or Text Editor**: IntelliJ IDEA, Eclipse, VS Code, or any other editor.
- **Command Line or Terminal**: To run the program.

---

## Project Structure
```
QuizApp/
├── src/
│   ├── Main.java        // Entry point of the program
│   ├── Question.java    // Represents a quiz question
│   └── Quiz.java        // Handles the quiz logic
└── README.md            // Project documentation
```

---

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Rak-Code/QuizApp.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd QuizApp/src
   ```
3. **Compile the Java Files**:
   ```bash
   javac *.java
   ```
4. **Run the Application**:
   ```bash
   java Main
   ```

---

## How to Play
1. The application will display one question at a time with multiple options.
2. Type the number corresponding to your answer and press Enter.
3. The program will provide feedback (Correct/Wrong) after each question.
4. At the end, your total score will be displayed.

---

## Sample Output
```
Welcome to the Quiz Application!
Answer the following questions by choosing the correct option number.
Let's start!

1. Which of the following is not a principle of OOP?
   1. Encapsulation
   2. Polymorphism
   3. Inheritance
   4. Compilation
Enter your choice (1-4): 4
Correct!

2. Which feature of OOP allows creating a new class from an existing class?
   1. Encapsulation
   2. Inheritance
   3. Polymorphism
   4. Abstraction
Enter your choice (1-4): 2
Correct!

Quiz Over! Your score: 2/2
Thank you for playing!
```

---

## Customization
You can modify the questions in the `Main.java` file:
```java
quiz.addQuestion(new Question(
    "What is encapsulation in Java?",
    new String[] {
        "Hiding the implementation details and showing only functionality",
        "Bundling data and methods operating on that data together",
        "Allowing multiple methods with the same name",
        "Providing a default behavior"
    },
    2
));
```
---

## Future Enhancements
- Add a feature to track the time taken for the quiz.
- Save scores to a file or database.
- Convert the console application into a web or GUI-based application using JavaFX or Spring Boot.

---

## License
This project is open-source and available under the [MIT License](LICENSE).

---

## Author
**Rak-Code**  
[GitHub Profile](https://github.com/Rak-Code)
rakesh....

