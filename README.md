# 📘 Quiz Game – Java (OOP + Git Practice)

## 📌 Project Overview
This is a **console-based Quiz Game** developed in **Java** using **Object-Oriented Programming (OOP)** principles.  

The game allows a user to:
- Answer multiple-choice questions
- Get immediate feedback
- View final score at the end of the quiz

No external libraries are used.

---

## 🎯 Objectives
- Learn and apply core **OOP concepts**
- Practice **Git and GitHub** using a real project
- Understand **project flow and structure**
- Follow **industry-style version control practices**

---

## 🧠 OOP Concepts Used
- **Encapsulation** – Data is hidden using private variables and accessed via methods
- **Abstraction** – Abstract `Question` class hides implementation details
- **Inheritance** – `MCQQuestion` extends `Question`
- **Polymorphism** – Same method behaves differently for different question types
- **Composition** – `QuizGame` uses `Player` and `QuestionBank`

---

## 🛠️ Technologies Used
- Java (Core Java)
- Git
- GitHub
- VS Code

---

## 📂 Project Structure
```

QuizGame/
 ├── src/
 │   ├── model/
 │   │   ├── Question.java
 │   │   ├── MCQQuestion.java
 │   │   └── Player.java
 │   │
 │   ├── services/
 │   │   ├── QuestionBank.java
 │   │   └── QuizGame.java
 │   │
 │   └── App.java
 └── README.md

```


---

## 🔄 Application Flow
1. User enters name
2. Quiz starts
3. Questions are displayed one by one
4. User selects answers
5. Score is updated
6. Final score is displayed

---

## ▶️ How to Run the Project

### Prerequisites
- Java JDK installed
- VS Code with **Java Extension Pack**

### Steps
1. Clone the repository
   ```bash
   git clone <repository-url>
   ```
2. Open the project folder in VS Code
3. Open App.java
- Click the Run ▶️ button
