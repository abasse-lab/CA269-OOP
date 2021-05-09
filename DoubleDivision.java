import java.util.Scanner;

public class DoubleDivision
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter two floating point numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        double div = a / b;
        in.close();
        System.out.printf("%.1f / %.1f is %.1f\n",a, b, div);
    }
}
