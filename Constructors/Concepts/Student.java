package Constructors.Concepts;
// basic constructor example
class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aisha", 20); // constructor call
        s1.display();
    }
}

