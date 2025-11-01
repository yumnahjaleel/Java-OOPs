package Constructors.Questions;
import java.util.Scanner;
import java.util.Scanner;

class CAR {
    private String model;
    private String color;
    private double price;

    // Default constructor - chains to two-argument constructor
    public CAR() {
        this("Unknown Model", "Unknown Color");
    }

    // One-argument constructor - chains to two-argument constructor
    public CAR(String model) {
        this(model, "Unknown Color");
    }

    // Two-argument constructor - main constructor
    public CAR(String model, String color) {
        this.model = model;
        this.color = color;
        this.price = 0.0;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // setDetails method
    public void setDetails(String model, String color, double price) {
        setModel(model);
        setColor(color);
        setPrice(price);
    }

    // getDetails method
    public void getDetails() {
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: $" + getPrice());
    }

    // display method
    public void display() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Car 1: Using default constructor
        CAR car1 = new CAR();
        System.out.println("=== CAR 1 (Default Constructor) ===");
        System.out.print("Enter price: $");
        car1.setPrice(sc.nextDouble());
        sc.nextLine(); // consume newline
        car1.display();

        // Car 2: Using one-argument constructor
        System.out.println("\n=== CAR 2 (One-Argument Constructor) ===");
        System.out.print("Enter model: ");
        String model2 = sc.nextLine();
        CAR car2 = new CAR(model2);
        System.out.print("Enter price: $");
        car2.setPrice(sc.nextDouble());
        sc.nextLine(); // consume newline
        car2.display();

        // Car 3: Using two-argument constructor
        System.out.println("\n=== CAR 3 (Two-Argument Constructor) ===");
        System.out.print("Enter model: ");
        String model3 = sc.nextLine();
        System.out.print("Enter color: ");
        String color3 = sc.nextLine();
        CAR car3 = new CAR(model3, color3);
        System.out.print("Enter price: $");
        car3.setPrice(sc.nextDouble());
        car3.display();

        // Summary
        System.out.println("\n========== ALL CARS ==========");
        car1.display();
        car2.display();
        car3.display();

        sc.close();
    }
}
