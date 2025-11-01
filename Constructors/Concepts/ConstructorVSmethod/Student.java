package Constructors.Concepts.ConstructorVSmethod;
class Student {
    String name;

    // Constructor
    Student(String n) {
        name = n;
        System.out.println("Constructor called");
    }

    // Method
    void showName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Yumnah"); // constructor called automatically
        s1.showName(); // method called manually
    }
}

