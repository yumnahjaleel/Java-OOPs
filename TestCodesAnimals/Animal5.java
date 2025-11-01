package TestCodesAnimals;
import java.util.Scanner;
public class Animal5 {
    String colour;
    int age;

    void initObj(String c, int a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter colour of animal: ");
        c=sc.nextLine();
        colour = c;
        System.out.print("Enter Age of animal: ");
        a=sc.nextInt();
        age = a;
    }
    void display(){
        System.out.println(colour+","+age);
    }

    public static void main(String[] args) {
        Animal5 a = new Animal5();
        a.initObj(a.colour,a.age);
        a.display();
    }
}
