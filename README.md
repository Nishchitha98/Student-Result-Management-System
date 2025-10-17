# Student-Result-Management-System
Overview

Student Result Management System is a Java console application that manages student data, calculates grades, averages, and displays exam results. It demonstrates OOP concepts:
Inheritance
Abstraction
Polymorphism
Static methods
This project is perfect for learning Java fundamentals and menu-driven programming.

Features
Add multiple students with:
Name,Age,Roll Number,Marks
Display student information.
Calculate average marks.
Determine grades:
A: > 90
B: > 80
C: > 70
P: ≤ 70
Display Internal and Final Exam results using abstract classes and polymorphism.
User-friendly menu-driven interface.

Technologies
Java SE 25
Scanner for input handling
OOP concepts (Inheritance, Abstraction, Polymorphism)

How to Run
# Clone the repository
git clone <https://github.com/Nishchitha98/Student-Result-Management-System.git>

# Navigate into project folder
cd StudentResult

# Compile all Java files
javac *.java

# Run the program
java StudentResult


Follow the menu to input student details and view results.

Project Structure
StudentResult/
│
├── Person.java          # Base class for Person
├── Student.java         # Derived class for Student
├── Exam.java            # Abstract class for Exam
├── InternalExam.java    # Internal Exam class
├── FinalExam.java       # Final Exam class
├── StudentResult.java   # Main class with menu interface
└── README.md            # Project documentation

Example Output
Enter number of students: 2
Enter details of student 1:
Enter name: John Doe
Enter age: 20
Enter roll number: 101
Enter marks: 85

Enter details of student 2:
Enter name: Jane Smith
Enter age: 21
Enter roll number: 102
Enter marks: 92

Menu:
1. Display student information
2. Show Average marks
3. Show grade
4. Show exam results
5. Exit

Average marks: 88.5
