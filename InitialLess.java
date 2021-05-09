import java.util.Scanner;

public class InitialLess
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();
        String rest = name.substring(1);
        in.close();
        System.out.printf("Initialless, your name is %s.\n",rest);

    }
}