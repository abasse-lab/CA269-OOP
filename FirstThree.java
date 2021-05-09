import java.util.Scanner;

public class FirstThree
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();
        char first = name.charAt(0);
        char second = name.charAt(1);
        char third = name.charAt(2);
        in.close();
        System.out.printf("Your nickname is %s%s%s.\n",first,second,third);

        
        // Use the substring() method of the String class.
    }
}