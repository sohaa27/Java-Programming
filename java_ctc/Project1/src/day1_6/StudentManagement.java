package day1_6;

import java.util.Scanner;

class Student {
    private static int idCounter = 1000; // auto-generated student ID start from 1000
    private int student_Id;
    private String student_name;
    private int[] marks = new int[3];
    private double average;
    private char grade;

    // Default constructor
    public Student() {
        this.student_Id = ++idCounter;
    }

    // Parameterized constructor
    public Student(String name, int[] marks) {
        this.student_Id = ++idCounter;
        this.student_name = name;
        this.marks = marks.clone(); // copy marks
        calculateAverageAndGrade();
    }

    // Add student details (used when object created via default constructor)
    public void addStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        this.student_name = sc.nextLine();

        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); // consume leftover newline
        calculateAverageAndGrade();
    }

    // Calculate average and assign grade
    private void calculateAverageAndGrade() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        this.average = sum / 3.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    // Display all student details
    public void display() {
        System.out.println("Student Id: " + student_Id);
        System.out.println("Name: " + student_name);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }

    // Overloaded display by name
    public void display(String name) {
        if (this.student_name.equalsIgnoreCase(name)) {
            display();
        }
    }

    // Overloaded display by Id
    public void display(int id) {
        if (this.student_Id == id) {
            display();
        }
    }

    public String getStudentName() {
        return student_name;
    }

    public int getStudentId() {
        return student_Id;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];  // max 100 students
        int studentCount = 0;

        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display Student By Name");
            System.out.println("4. Display Student By Id");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    if (studentCount < students.length) {
                        Student s = new Student();
                        s.addStudent(sc);
                        students[studentCount++] = s;
                        System.out.println("Student added successfully with ID: " + s.getStudentId());
                    } else {
                        System.out.println("Student limit reached. Cannot add more.");
                    }
                    break;

                case 2:
                    if (studentCount == 0) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("\nAll Student Details:");
                        for (int i = 0; i < studentCount; i++) {
                            students[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    boolean foundByName = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getStudentName().equalsIgnoreCase(searchName)) {
                            students[i].display(searchName);
                            foundByName = true;
                        }
                    }
                    if (!foundByName) {
                        System.out.println("No student found with the name: " + searchName);
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to search: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    boolean foundById = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getStudentId() == searchId) {
                            students[i].display(searchId);
                            foundById = true;
                            break;
                        }
                    }
                    if (!foundById) {
                        System.out.println("No student found with ID: " + searchId);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
