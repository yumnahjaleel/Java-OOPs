package Constructors;
import java.util.Scanner;

class student {
    String name;
    int age;
    String course;

    // Parameterized constructor
    public student(String name, int age, String course) {
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

public class Main3 {
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
        student s = new student(name, age, course);

        // Display the object
        System.out.println("\nStudent Details:");
        s.display();

        sc.close();
    }
}