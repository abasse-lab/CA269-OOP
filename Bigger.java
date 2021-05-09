import java.util.Scanner;

public class Bigger
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        if (a > b)
        {
            System.out.printf("%d is the biggest.\n", a);
        }
        else
        {
            System.out.printf("%d is the biggest.\n", b);
        }

    }
}