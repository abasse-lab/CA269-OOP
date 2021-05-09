import java.util.Scanner;

public class IsTeenager
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = in.nextInt();
        in.close();
        if (a < 13 || a > 19)
        {
            System.out.printf("You are not a teenager.\n");
        }
        else
        {
            System.out.printf("You are a teenager.\n");
        }

    }
}

