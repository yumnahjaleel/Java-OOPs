package TestCodesAnimals;

public class w12q1 {
    public static void division(int a, int b)
    {
        int div = a/b;
        System.out.println(div);
    }

    public static void main(String[] args) throws Exception
    {
        int a = 12;
        int b = 3;

        try
        {
            division(a, b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator should not be zero.");
        }
        System.out.println("Rest of the code.");
    }
}
