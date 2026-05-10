# Course Enrollment and Grade Management System

A Java-based console application designed to manage university courses, student enrollments, and academic performance tracking. This project demonstrates core Object-Oriented Programming (OOP) principles, including encapsulation, class relationships, and the strategic use of static versus instance members.

## Features

* **Course Management:** Add new courses with specific capacities and unique course codes.
* **Student Management:** Register new students with unique IDs.
* **Enrollment System:** Enroll students in specific courses while respecting maximum course capacities.
* **Grade Tracking:** Assign numerical grades to students for their enrolled courses.
* **GPA Calculation:** Automatically calculate a student's overall GPA on a standard 4.0 scale based on their course grades.
* **Global Metrics:** Track the total number of student enrollments across the entire university using shared static state.
* **Interactive UI:** A command-line interface (CLI) for administrators to perform all system operations interactively.

## Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher is required. 

## Project Structure

* `Student.java`: Manages individual student data, their enrolled courses, and grade mapping.
* `Course.java`: Represents a university course, tracking its capacity and the global university enrollment count.
* `CourseManagement.java`: The central controller that manages lists of students and courses, handles search logic, and processes enrollments and GPA calculations.
* `AdminInterface.java`: The entry point of the application containing the interactive menu and user input handling.

## How to Run

1. **Clone or Download** the repository to your local machine.
2. **Open a Terminal** or command prompt and navigate to the folder containing the `.java` files.
3. **Compile the code** using the Java compiler:
   ```bash
   javac AdminInterface.java

   java AdminInterface


