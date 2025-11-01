package Constructors.Concepts.ConstructorChaining;
class Student {
    String name;
    int age;

    Student() {
        this("Default Name", 18); // calling another constructor
        System.out.println("Default constructor called");
    }

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

