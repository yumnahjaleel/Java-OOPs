package Constructors.Concepts.CopyConstructor;
class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ahmed", 21);
        Student s2 = new Student(s1); // Copy constructor called

        s1.display();
        s2.display();
    }
}

