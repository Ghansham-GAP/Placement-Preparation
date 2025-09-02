//Create a Student class with attributes (name, rollNo, marks) and methods to display details.
//(Concept: classes, objects)

package JAVA;

import java.util.Scanner;

class StudentDetails {
    String name;
    int rollNo;
    int marks;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDetails s1 = new StudentDetails();

        System.out.print("Enter name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s1.rollNo = sc.nextInt();

        System.out.print("Enter marks: ");
        s1.marks = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        s1.displayDetails();

        sc.close();
    }
}
