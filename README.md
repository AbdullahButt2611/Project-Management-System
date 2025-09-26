# 📂 Project Management System

## 📖 Introduction

**Project Management System** is a **Java-based desktop application** developed as a **mid-term academic project**. Its main objective is to provide a structured platform for managing student projects, evaluations, and task assignments in an academic setting.

> ⚠️ **Note:** This project was built solely for academic purposes and is not a commercial solution. The system is non-portable as it does not use a connected database.

## ✨ Features

* **Two Actor Roles:**

  * **Students** – View assigned tasks, evaluations, deadlines, and grades.
  * **Teachers/Admins** – Create and evaluate projects, assign tasks, check student progress, restrict/cancel projects, and manage grading.
* **Task & Project Management** – Assign and update tasks with clear deadlines and evaluation criteria.
* **Deadline Tracking** – Students can check results after task/project deadlines.
* **Evaluation System** – Teachers can monitor, grade, and manage projects efficiently.
* **Role-Based Access Control** – Different access levels for students and teachers to ensure secure usage.

## 🛠️ Technologies Used

* **Language:** Java
* **UI Framework:** Swing
* **Architecture:** MVC (Model-View-Controller)
* **Design Patterns:** MVC, Observer
* **Libraries:** [JCalendar](https://toedter.com/jcalendar/) (for calendar and scheduling)
* **Concepts Applied:**

  * Object-Oriented Programming (Encapsulation, Inheritance, Polymorphism)
  * Exception Handling
  * Modular Code Design

## 📐 Design Patterns & Concepts

### 🔹 Model-View-Controller (MVC)

Separates data handling (Model), UI (View), and logic (Controller), ensuring maintainability and scalability.

### 🔹 Observer Pattern

Enables automatic updates to relevant components when project tasks or evaluations are changed.

### 🔹 Object-Oriented Programming (OOP)

Real-world entities like projects, tasks, and users are modeled as classes, making the system modular and extensible.

### 🔹 Exception Handling

Robust error management ensures the application runs smoothly and provides meaningful feedback to users.

## 🚀 How to Run the Project

1. Download/clone the repository:

   ```bash
   git clone https://github.com/<your-username>/Project-Management-System.git
   ```
2. Open the project in **NetBeans IDE** (recommended).
3. Add the required `JCalendar.jar` library to the project dependencies.
4. Build and run the project directly from the IDE.

## 📌 Notes

* Requires **JCalendar.jar** file for execution.
* Works best in **NetBeans IDE**.
* No external database connected — file-system-based application only.

## 🏁 Conclusion

The **Project Management System** demonstrates how academic projects can be structured and managed efficiently using Java. With features like role-based access, evaluation, and deadline tracking, it provides a foundation for project management in academic contexts. The application showcases effective use of **MVC architecture, Observer pattern, and OOP principles**, making it a valuable educational project.
