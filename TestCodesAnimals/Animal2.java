package TestCodesAnimals;
// Define a class named Animal2
public class Animal2
{
    // Method to display that an animal has run a certain distance
    public void run(String name, int distance_km)
    {
        System.out.println(name + " has run " + distance_km + " km");
    }

    // Main method - program entry point
    public static void main(String[] args)
    {
        // Create an object 'jumbo' of Animal2
        Animal2 jumbo = new Animal2();
        jumbo.run("Jumbo", 5); // Call run method with name "Jumbo" and distance 5 km
        jumbo.eat("Jumbo", "grass"); // Call eat method with name "Jumbo" and food "grass"

        // Create another object 'buzo' of Animal2
        Animal2 buzo = new Animal2();
        buzo.eat("Buzo", "meat"); // Call eat method with name "Buzo" and food "meat"
        buzo.run("Buzo", 12); // Call run method with name "Buzo" and distance 12 km
    }

    // Method to display that an animal is eating a specific dish
    public void eat(String name, String dish)
    {
        System.out.println(name + " is eating " + dish);
    }
}
