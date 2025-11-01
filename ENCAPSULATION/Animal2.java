package ENCAPSULATION;
import java.util.Scanner;
// ============================================
// METHOD 2: SCANNER PASSED TO SETTERS
// ============================================
class Animal2 {
    String name;
    double weight;

    // Setters with Scanner parameter
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        this.name = sc.nextLine();
    }

    public void setWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal weight (kg): ");
        this.weight = sc.nextDouble();
        sc.nextLine(); // Clear buffer
    }

    // Regular Getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void display() {
        System.out.println("Animal Name: " + name + ", Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal2 A1 = new Animal2();
        System.out.println("Enter details for Animal A1:");
        A1.setName();
        A1.setWeight();

        Animal2 A2 = new Animal2();
        System.out.println("\nEnter details for Animal A2:");
        A2.setName();
        A2.setWeight();

        System.out.println("\n--- Animal Details ---");
        A1.display();
        A2.display();

        sc.close();
    }
}
