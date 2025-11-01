package Constructors;
import java.util.Scanner;

class Employee {
    private String name;
    private int empId;
    private String department;
    private double salary;

    // 1. Default Constructor (No-argument constructor)
    public Employee() {
        this.name = "Not Assigned";
        this.empId = 0;
        this.department = "General";
        this.salary = 0.0;
        System.out.println("Default constructor called");
    }

    // 2. Parameterized Constructor (All parameters)
    public Employee(String name, int empId, String department, double salary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.salary = salary;
        System.out.println("Parameterized constructor (4 params) called");
    }

    // 3. Parameterized Constructor (Partial parameters)
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
        this.department = "General";
        this.salary = 25000.0;
        System.out.println("Parameterized constructor (2 params) called");
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JAVA CONSTRUCTOR TYPES DEMONSTRATION ===\n");

        // 1. Using Default Constructor
        System.out.println("1. Creating employee using DEFAULT constructor:");
        Employee emp1 = new Employee();
        emp1.display();

        System.out.println("---\n");

        // 2. Using Parameterized Constructor (All parameters)
        System.out.println("2. Creating employee using PARAMETERIZED constructor:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee emp2 = new Employee(name, empId, department, salary);
        emp2.display();

        System.out.println("---\n");

        // 3. Using Parameterized Constructor (Partial parameters)
        System.out.println("3. Creating employee using PARTIAL parameterized constructor:");
        System.out.print("Enter name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int empId2 = scanner.nextInt();
        scanner.nextLine();

        Employee emp3 = new Employee(name2, empId2);
        System.out.println("(Department and salary set to defaults)");
        emp3.display();

        System.out.println("---\n");
        System.out.println("SUMMARY:");
        System.out.println("- Default Constructor: Initializes with default values");
        System.out.println("- Parameterized Constructor: Accepts specific values");
    }
}
