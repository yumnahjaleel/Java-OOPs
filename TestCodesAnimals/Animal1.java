package TestCodesAnimals;
public class Animal1
{
    String name;
    // Method to display that an animal is running
    public void run(String name)
    {
        System.out.println(name + " is running");
    }

    // Method to display that an animal is eating
    public void eat(String name)
    {
        System.out.println(name + " is eating...!!");
    }

    // Main method - program entry point
    public static void main(String[] args)
    {
        // Create an object 'jumbo' of Animal4
        Animal1 jumbo = new Animal1();
        jumbo.run("Jumbo"); // Call run method with "Jumbo"
        jumbo.eat("Jumbo"); // Call eat method with "Jumbo"

        // Create another object 'buzo' of Animal4
        Animal1 buzo = new Animal1();
        buzo.eat("Buzo"); // Call eat method with "Buzo"
        buzo.run("Buzo"); // Call run method with "Buzo"
    }

}

