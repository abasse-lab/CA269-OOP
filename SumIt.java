import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter two numbers: ");
        
        // Read in the numbers (you need a nextInt for each integer)
        // :PUT YOUR CODE HERE:
        int a = in.nextInt();
        int b = in.nextInt();
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        // :PUT YOUR CODE HERE:
        int add = a + b;
        in.close();

        // prepare the user for the result
        // print out the result (use System.out.println() )
        // :PUT YOUR CODE HERE:
        System.out.printf("%d and %d is %d\n",a, b, add);
    }
}	 	  	   	 	      	    	        	 	
