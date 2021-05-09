import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();
        // Use a loop to print out the numbers
        int b = 20;
        while (n < b+1)
        {
            System.out.print(n + " ");
            n++;
        }
    System.out.println();
    }
}