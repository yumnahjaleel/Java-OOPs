package TestCodesAnimals;

class Animal
{
    // Method to display a running message
    void run()
    {
        System.out.println("I'm running");
    }
}

// Define a class named Birds8
class Birds
{
    // Method to display a flying message
    void fly()
    {
        System.out.println("I'm flying");
    }
}
public class Main{
    // Main method - program entry point
    public static void main(String[] args)
    {
        // Create an object 'buzo' of Animal8 and call the run method
        Animal A = new Animal();
        A.run();

        // Create an object 'sparrow' of Birds8 and call the fly method
        Birds sparrow = new Birds();
        sparrow.fly();
    }
}

