package Constructors;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    // Parameterized constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        // Passing user input to constructor
        Student student = new Student(name, age, course);

        // Display the object
        System.out.println("\nStudent Details:");
        student.display();

        sc.close();
    }
}