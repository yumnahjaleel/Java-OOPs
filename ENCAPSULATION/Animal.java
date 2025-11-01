package ENCAPSULATION;
import java.util.Scanner;
class Animal {
    String name;
    double weight;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getters
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

        // Object A
        Animal A = new Animal();
        System.out.print("Enter name for Animal A: ");
        A.setName(sc.nextLine());
        System.out.print("Enter weight for Animal A: ");
        A.setWeight(sc.nextDouble());
        sc.nextLine(); // Clear buffer

        // Object B
        Animal B = new Animal();
        System.out.print("Enter name for Animal B: ");
        B.setName(sc.nextLine());
        System.out.print("Enter weight for Animal B: ");
        B.setWeight(sc.nextDouble());

        // Display
        System.out.println("\n--- Animal Details ---");
        A.display();
        B.display();

        sc.close();
    }
}
