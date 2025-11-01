package Constructors.Concepts.ParameterizedConstructor;

class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aisha", 20);
        Student s2 = new Student("Fatima", 22);

        s1.display();
        s2.display();
    }
}

