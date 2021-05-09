import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a quantity in inches: ");
        int num = in.nextInt();
        // Find out how many inches (use a whole number for integers)
        double convert = num * 2.54;
        in.close();
        // Print out the result
        System.out.printf("%d inch is %.2f cm\n",num, convert);
    }
}