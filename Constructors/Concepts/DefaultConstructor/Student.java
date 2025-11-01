package Constructors.Concepts.DefaultConstructor;

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // calls default constructor
        s1.display();
    }
}

