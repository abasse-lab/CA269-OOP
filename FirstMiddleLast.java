import java.util.Scanner;
public class FirstMiddleLast
{
     public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the phrase (actually the whole line)
        String phrase = in.nextLine();

        // count how many times "hi" occurs.
        // YOUR CODE HERE
        int length = phrase.length();
        System.out.println(phrase.substring(0, 1));
        System.out.println(phrase.substring(1, length - 1));
        System.out.println(phrase.substring(length - 1, length));
    }
}
