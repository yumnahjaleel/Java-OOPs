package TestCodesAnimals;
import java.util.Scanner;

public class AnimalTestCode {
    String name;
    int dist;

    public void run(String name, double dist) {
        System.out.println(name + " has ran " + dist);
    }

    void inputForMethodParameter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name and Distance travelled: ");
        String name = sc.nextLine();
        double dist = sc.nextDouble();
        run(name,dist);
    }

   public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        AnimalTestCode A1 = new AnimalTestCode();
        System.out.print("Enter name of Animal: ");
        A1.name = s.nextLine();

        System.out.print("Enter distance: ");
        A1.dist = s.nextInt();

        A1.run(A1.name, A1.dist);
        A1.inputForMethodParameter();

        s.close();
    }
}

