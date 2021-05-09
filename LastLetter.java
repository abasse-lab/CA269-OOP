import java.util.Scanner;

public class LastLetter
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();
        char last = name.charAt(name.length() - 1);
        in.close();
        System.out.printf("The last letter of your name is %c.\n",last);

        
        // Use the substring() method of the String class.
    }
}