package TestCodesAnimals;

public class Animal3
{   String name;
    // Method to display that an animal has run a certain distance
    public void run(String name, int distance_km)
    {
        System.out.println(name + " has run " + distance_km + " km");
    }
    public void details(String name) {
        System.out.println("-------Details of " + name + "-------");
    }

    // Main method - program entry point
    public static void main(String[] args)
    {
        // Create an object 'jumbo' of Animal5
        Animal3 jumbo = new Animal3();
        jumbo.run("Jumbo", 5); // Call run method with name "Jumbo" and distance 5 km
        jumbo.eat("Jumbo", "grass"); // Call eat method with name "Jumbo" and food "grass"

        // Create another object 'buzo' of Animal5
        Animal3 buzo = new Animal3();
        buzo.eat("Buzo", "meat"); // Call eat method with name "Buzo" and food "meat"
        buzo.run("Buzo", 12); // Call run method with name "Buzo" and distance 12 km
    }

    // Method to display that an animal is eating a specific dish
    public void eat(String name, String dish)
    {
        System.out.println(name + " is eating " + dish);
    }
}