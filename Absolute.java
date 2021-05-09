import java.util.Scanner;

public class Absolute
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        if (num < 0)
        {
            int abs = num * -1;
            System.out.printf("The absolute value is %d.\n",abs);
        }
        else
        {
            System.out.printf("The absolute value is %d.\n",num);
        }

    }
}