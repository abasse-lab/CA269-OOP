import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        int length = name.length();
        in.close();
        System.out.printf("Hello %s, your name has %d letters.\n",name,length);
        
        // Use the length() method of the String class.
    }

}