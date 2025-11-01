package ENCAPSULATION;
import java.util.Scanner;
// METHOD 3: INPUT METHOD USING SETTERS
// ============================================
class Animal3 {
    String name;
    double weight;

    // Setters
    public void setName(String n) {
        this.name = n;
    }

    public void setWeight(double w) {
        this.weight = w;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // Input method that uses setters internally
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        name=sc.nextLine();
        System.out.print("Enter animal weight (kg): ");
        weight=sc.nextDouble();
        sc.nextLine(); // Clear buffer
    }

    public void display() {
        System.out.println("Animal Name: " + getName() + ", Weight: " + getWeight() + " kg");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal3 A = new Animal3();
        System.out.println("Enter details for Animal A:");
        A.inputData();

        Animal3 B = new Animal3();
        System.out.println("\nEnter details for Animal B:");
        B.inputData();

        System.out.println("\n--- Animal Details ---");
        A.display();
        B.display();

        sc.close();
    }
}
