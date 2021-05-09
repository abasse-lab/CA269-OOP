import java.util.Scanner;

public class EvenOdd
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        if (num % 2 == 0)
        {
            System.out.printf("%d is even.\n", num);
        }
        else
        {
            System.out.printf("%d is odd.\n", num);
        }

    }
}