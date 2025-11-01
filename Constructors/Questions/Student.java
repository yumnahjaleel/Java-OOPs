package Constructors.Questions;
class Student {
    private String name;
    private int age;
    private String course;

    // Constructor 1: No parameters
    // Calls Constructor 2 with default values
    public Student() {
        this("Unknown", 18);  // Chaining to Constructor 2
        System.out.println("No-arg constructor called");
    }

    // Constructor 2: Two parameters
    // Calls Constructor 3 with default course
    public Student(String name, int age) {
        this(name, age, "Not Assigned");  // Chaining to Constructor 3
        System.out.println("Two-arg constructor called");
    }

    // Constructor 3: All parameters
    // This is the main constructor that does actual initialization
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-arg constructor called");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {
        // Each object creation shows different chaining paths

        System.out.println("Creating student1 with no arguments:");
        Student student1 = new Student();
        student1.displayInfo();

        System.out.println("Creating student2 with name and age:");
        Student student2 = new Student("Alice", 20);
        student2.displayInfo();

        System.out.println("Creating student3 with all details:");
        Student student3 = new Student("Bob", 22, "Computer Science");
        student3.displayInfo();
    }
}
