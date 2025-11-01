package Constructors.Questions;
import java.util.Scanner;

public class FRUIT {
    // Data members
    private String colour;
    private String taste;
    private double price;

    // Method to set the details of the fruit
    public void setDetails(String colour, String taste, double price) {
        this.colour = colour;
        this.taste = taste;
        this.price = price;
    }

    // Method to display the details of the fruit
    public void display() {
        System.out.println("Fruit Details:");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println("Price: $" + price);
    }

    // Main method to test the FRUIT class
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Create a FRUIT object
        FRUIT fruit = new FRUIT();

        // Get input from user
        System.out.println("Enter fruit details:");
        System.out.print("Enter colour: ");
        String colour = scanner.nextLine();

        System.out.print("Enter taste: ");
        String taste = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        // Set details using setDetails() method
        fruit.setDetails(colour, taste, price);

        // Display the fruit details
        System.out.println("\n");
        fruit.display();

        scanner.close();
    }
}
