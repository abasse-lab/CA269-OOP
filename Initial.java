import java.util.Scanner;

public class Initial
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        char first = name.charAt(0);
        in.close();
        System.out.printf("%s starts with the letter %s.\n",name,first);

        
        // Use the substring() method of the String class.
    }
}