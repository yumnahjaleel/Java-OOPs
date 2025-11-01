package Constructors;
import java.util.Scanner;
public class Fruit {
        private String name;
        private String color;
        private double price;

        // Default Constructor (No-argument)
        public Fruit() {
            this.name = "Unknown";
            this.color = "Not specified";
            this.price = 0.0;
            System.out.println("Default constructor called\n");
        }

        // One-argument Constructor
        public Fruit(String name) {
            this.name = name;
            this.color = "Not specified";
            this.price = 0.0;
            System.out.println("One-argument constructor called\n");
        }

        // Two-argument Constructor
        public Fruit(String name, String color) {
            this.name = name;
            this.color = color;
            this.price = 0.0;
            System.out.println("Two-argument constructor called\n");
        }

        // Three-argument Constructor (Parameterized)
        public Fruit(String name, String color, double price) {
            this.name = name;
            this.color = color;
            this.price = price;
            System.out.println("Three-argument constructor called\n");
        }

        // Method to display fruit details
        public void display() {
            System.out.println("Fruit Name: " + name);
            System.out.println("Color: " + color);
            System.out.println("Price: $" + price);
            System.out.println();
        }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("=== FRUIT CLASS CONSTRUCTOR DEMONSTRATION ===\n");

        // 1. Using Default Constructor
        System.out.println("1. Creating fruit using DEFAULT constructor:");
        Fruit fruit1 = new Fruit();
        fruit1.display();

        System.out.println("-------------------------------------------\n");

        // 2. Using One-argument Constructor
        System.out.println("2. Creating fruit using ONE-ARGUMENT constructor:");
        System.out.print("Enter fruit name: ");
        String name1 = s.nextLine();

        Fruit fruit2 = new Fruit(name1);
        fruit2.display();

        System.out.println("-------------------------------------------\n");

        // 3. Using Two-argument Constructor
        System.out.println("3. Creating fruit using TWO-ARGUMENT constructor:");
        System.out.print("Enter fruit name: ");
        String name2 = s.nextLine();

        System.out.print("Enter fruit color: ");
        String color2 = s.nextLine();

        Fruit fruit3 = new Fruit(name2, color2);
        fruit3.display();

        System.out.println("-------------------------------------------\n");

        // 4. Using Three-argument Constructor
        System.out.println("4. Creating fruit using THREE-ARGUMENT constructor:");
        System.out.print("Enter fruit name: ");
        String name3 = s.nextLine();

        System.out.print("Enter fruit color: ");
        String color3 = s.nextLine();

        System.out.print("Enter fruit price: $");
        double price3 = s.nextDouble();

        Fruit fruit4 = new Fruit(name3, color3, price3);
        fruit4.display();

        System.out.println("-------------------------------------------\n");

        System.out.println("SUMMARY:");
        System.out.println("Total fruits created: 4");
        System.out.println("- fruit1: Default constructor (no arguments)");
        System.out.println("- fruit2: One-argument constructor (name only)");
        System.out.println("- fruit3: Two-argument constructor (name + color)");
        System.out.println("- fruit4: Three-argument constructor (all parameters)");

        s.close();
    }
}
